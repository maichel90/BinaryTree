package com.larodriguezm.mo.model;

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
public class Nodo {
	
	private Integer nodoId;
	
	private Nodo nodoMenor;
	
	private Nodo nodoMayor;
	
	private Integer valor;

}
