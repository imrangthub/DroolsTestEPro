package com.emon.drooltest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.emon.drooltest.Customer.CustomerType;

public class ApplicantService {

	@Autowired
	private KieSession kieSession;

	public SuggestedRole suggestARoleForApplicant(Applicant applicant, SuggestedRole suggestedRole) throws IOException {
		kieSession.insert(applicant);
		kieSession.setGlobal("suggestedRole", suggestedRole);
		kieSession.fireAllRules();
		System.out.println(suggestedRole.getRole());
		return suggestedRole;

	}

}
