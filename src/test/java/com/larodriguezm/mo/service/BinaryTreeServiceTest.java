package com.larodriguezm.mo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.larodriguezm.mo.dto.NumberDTO;
import com.larodriguezm.mo.dto.ResponseDTO;
import com.larodriguezm.mo.dto.SearchDTO;

@SpringBootTest
class BinaryTreeServiceTest {
	
	@Autowired
	private BinaryTreeService binaryTreeService;

	@Test
	void createBinaryTree() {
		NumberDTO dto = new NumberDTO();
		dto.setNumbers(new Integer[]{76,39,28,74,85,44,29,83,87});
		String jsonExpect = "{\"nodoDerecha\":{\"nodoDerecha\":{\"valor\":87},\"nodoIzquierda\":{\"valor\":83},\"valor\":85},\"nodoIzquierda\":{\"nodoDerecha\":{\"nodoIzquierda\":{\"valor\":44},\"valor\":74},\"nodoIzquierda\":{\"nodoDerecha\":{\"valor\":29},\"valor\":28},\"valor\":39},\"valor\":76}";
		
		ResponseDTO result = binaryTreeService.createBinaryTree(dto);
		String resultJson = new Gson().toJson(result.getBinaryTree());
		assertEquals(jsonExpect, resultJson);
	}
	
	@Test
	void createEmptyBinaryTree() {
		NumberDTO dto = new NumberDTO(new Integer[]{});
		ResponseDTO result = binaryTreeService.createBinaryTree(dto);
		assertEquals(null, result.getBinaryTree());
	}

	@Test
	void lowestCommonAncestor39() {
		SearchDTO search = new SearchDTO();
		search.setNumbers(new Integer[]{67,76,39,28,74,85,44,29,83,87});
		search.setNumeberOne(29);
		search.setNumeberTwo(44);
		
		ResponseDTO result = binaryTreeService.searchCommonAncestor(search);
		assertEquals(39, result.getCommonAncestor());
	}
	
	@Test
	void lowestCommonAncestor67() {
		SearchDTO search = new SearchDTO();
		search.setNumbers(new Integer[]{67,76,39,28,74,85,44,29,83,87});
		search.setNumeberOne(44);
		search.setNumeberTwo(87);
		
		ResponseDTO result = binaryTreeService.searchCommonAncestor(search);
		assertEquals(67, result.getCommonAncestor());
	}
	
	@Test
	void lowestCommonAncestor85() {
		SearchDTO search = new SearchDTO();
		search.setNumbers(new Integer[]{67,76,39,28,74,85,44,29,83,87});
		search.setNumeberOne(83);
		search.setNumeberTwo(87);
		
		ResponseDTO result = binaryTreeService.searchCommonAncestor(search);
		assertEquals(85, result.getCommonAncestor());
	}
	
	@Test
	void lowestCommonAncestor() {
		SearchDTO search = new SearchDTO();
		search.setNumbers(new Integer[]{});
		search.setNumeberOne(1);
		search.setNumeberTwo(2);
		
		ResponseDTO result = binaryTreeService.searchCommonAncestor(search);
		assertEquals(null, result.getCommonAncestor());
	}

}
