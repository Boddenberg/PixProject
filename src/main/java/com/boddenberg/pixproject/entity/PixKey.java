package com.boddenberg.pixproject.entity;

import com.boddenberg.pixproject.enums.TypeKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PixKey {

	private TypeKey type;
	private String value;
	
	
}
