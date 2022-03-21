package com.larodriguezm.mo.dto;

import com.larodriguezm.mo.model.Nodo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ResponseDTO {
	
	private Nodo binaryTree;
	
	private Integer commonAncestor;
	
}
