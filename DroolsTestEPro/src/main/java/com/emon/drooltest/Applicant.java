package com.emon.drooltest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {

	private String name;
	private int age;
	private double currentSalary;
	private int experienceInYears;

}
