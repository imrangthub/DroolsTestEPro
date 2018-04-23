package com.emon.drooltest;

import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.springframework.stereotype.Component;

@Component
public class ExcelResourceImporter {
	public String getRulesFromExcel(String url) {
		DecisionTableConfiguration dtc = KnowledgeBuilderFactory.newDecisionTableConfiguration();
		dtc.setInputType(DecisionTableInputType.XLSX);
		return new DecisionTableProviderImpl().loadFromResource(ResourceFactory.newClassPathResource(url), dtc);
	}
}
