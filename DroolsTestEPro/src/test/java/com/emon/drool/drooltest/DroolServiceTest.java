package com.emon.drool.drooltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.emon.drooltest.ApplicantService;
import com.emon.drooltest.Customer;
import com.emon.drooltest.CustomerService;
import com.emon.drooltest.DrooltestApplication;

@ContextConfiguration(classes = { DrooltestApplication.class, ApplicantService.class, CustomerService.class })
@RunWith(SpringRunner.class)
public class DroolServiceTest {

	@Autowired
	private CustomerService customerService;
	/*
	 * @Autowired private ApplicantService applicantService;
	 * 
	 * @Test public void testApplicant() throws IOException { Applicant
	 * applicant = new Applicant("Davis", 37, 1600000.0, 11); SuggestedRole
	 * suggestedRole = new SuggestedRole();
	 * applicantService.suggestARoleForApplicant(applicant, suggestedRole);
	 * assertEquals("Manager", suggestedRole.getRole());
	 * 
	 * }
	 */

	@Test
	public void giveIndvidualLongStanding_whenFireRule_thenCorrectDiscount() throws Exception {
		Customer customer = customerService.getDiscount();
		assertEquals(customer.getDiscount(), 20);
	}

}
