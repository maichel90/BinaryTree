package com.larodriguezm.mo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseDTO crearArbolBinario(@RequestBody NumberDTO dto) {
		arbolBinarioService.createBinaryTree(dto);
		return null;
	}
	
	@PostMapping("/{binaryTreeID}")
	public ResponseDTO searchCommonAncestor(@PathVariable Integer binaryTreeID, @RequestBody SearchDTO dto) {
		
		arbolBinarioService.searchCommonAncestor(binaryTreeID,dto);
		return null;
	}

}
