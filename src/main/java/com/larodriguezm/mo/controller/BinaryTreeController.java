package com.larodriguezm.mo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.larodriguezm.mo.dto.NumberDTO;
import com.larodriguezm.mo.dto.ResponseDTO;
import com.larodriguezm.mo.dto.SearchDTO;
import com.larodriguezm.mo.service.BinaryTreeService;

@RestController
@RequestMapping("/")
public class BinaryTreeController {
	
	@Autowired
	private BinaryTreeService arbolBinarioService;
	
	@PostMapping
	public ResponseEntity<Object> crearArbolBinario(@RequestBody NumberDTO dto) {
		ResponseDTO resp = arbolBinarioService.createBinaryTree(dto);
		return new ResponseEntity<>(resp.getBinaryTree(),HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<Object> searchCommonAncestor(@RequestBody SearchDTO dto) {
		ResponseDTO resp = arbolBinarioService.searchCommonAncestor(dto);
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
}
