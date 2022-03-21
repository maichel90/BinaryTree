package com.larodriguezm.mo.service;

import org.springframework.stereotype.Service;

import com.larodriguezm.mo.dto.NumberDTO;
import com.larodriguezm.mo.dto.ResponseDTO;
import com.larodriguezm.mo.dto.SearchDTO;
import com.larodriguezm.mo.model.Nodo;

@Service
public class BinaryTreeService {
	
	

	public ResponseDTO createBinaryTree(NumberDTO dto) {
		Nodo nodoRaiz = generateBinaryTree(dto.getNumbers());
		return ResponseDTO.builder().binaryTree(nodoRaiz).build();
	}
	
	public ResponseDTO searchCommonAncestor(SearchDTO dto) {
		Nodo nodoRaiz = generateBinaryTree(dto.getNumbers());
		Integer commonNodo = lowestCommonAncestor(nodoRaiz, dto.getNumeberOne(), dto.getNumeberTwo());
		return ResponseDTO.builder().commonAncestor(commonNodo).binaryTree(nodoRaiz).build();
	}
	
	private Nodo generateBinaryTree(Integer[] numbers) {
		Nodo nodoRaiz = null;
		for (Integer valor : numbers) {
			if(nodoRaiz == null) {
				nodoRaiz = new Nodo(valor);
			}else {
				insertNodo(nodoRaiz, valor);
			}
		}
		return nodoRaiz;
	}
	
	private void insertNodo(Nodo nodoPadre, Integer valor) {
		if(valor > nodoPadre.getValor()) {
			if(nodoPadre.getNodoDerecha() == null) {
				nodoPadre.setNodoDerecha(new Nodo(valor));
			}else {
				this.insertNodo(nodoPadre.getNodoDerecha(), valor);
			}
		}else {
			if(nodoPadre.getNodoIzquierda() == null) {
				nodoPadre.setNodoIzquierda(new Nodo(valor));
			}else {
				this.insertNodo(nodoPadre.getNodoIzquierda(), valor);
			}
		}
	}
	
	private Integer lowestCommonAncestor(Nodo nodoRaiz,Integer valor1, Integer valor2) {
		
		if (nodoRaiz == null)
            return null;
		
        if (nodoRaiz.getValor() > valor1 && nodoRaiz.getValor() > valor2)
            return lowestCommonAncestor(nodoRaiz.getNodoIzquierda(), valor1, valor2);
  
        if (nodoRaiz.getValor() < valor1 && nodoRaiz.getValor() < valor2)
            return lowestCommonAncestor(nodoRaiz.getNodoDerecha(), valor1, valor2);
  
        return nodoRaiz.getValor();
	}
	
}
