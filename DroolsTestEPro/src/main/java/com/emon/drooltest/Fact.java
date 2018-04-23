package com.emon.drooltest;

import org.kie.api.definition.type.Position;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fact {

	@Position(0)
	private String element;

	@Position(1)
	private String place;

}
