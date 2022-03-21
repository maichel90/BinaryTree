package com.larodriguezm.mo.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchDTO {
	
	private Integer[] numbers;
	
	private Integer numeberOne;
	
	private Integer numeberTwo;
	
}
