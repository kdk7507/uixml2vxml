package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

public abstract class ValueAbstractXMLElement extends XMLElement {
	
	public static final String valueAttributeName = "value";
	
	protected String valueAttributeValue;

	public ValueAbstractXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		valueAttributeValue = attributes.getValue(valueAttributeName);
	}

	public String getValueAttributeValue() {
		return valueAttributeValue;
	}
}
