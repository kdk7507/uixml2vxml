package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class ScenarioXMLElement extends XMLElement {

	public static final String scenarioFlowAttributeName = "ScenarioFlow";
	
	private String scenarioFlowAttributeValue;
	
	public ScenarioXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		scenarioFlowAttributeValue = attributes.getValue(scenarioFlowAttributeName);
//		System.out.println("scenarioFlowAttriValue : " + scenarioFlowAttriValue);
	}
	
	public String getScenarioFlowAttriValue() {
		return scenarioFlowAttributeValue;
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
