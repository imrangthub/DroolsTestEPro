package com.emon.drooltest;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private KieSession kieSession;

	public Product applyLabelToProduct(Product product) {
		kieSession.insert(product);
		kieSession.fireAllRules();
		System.out.println(product.getLabel());
		return product;

	}

}
