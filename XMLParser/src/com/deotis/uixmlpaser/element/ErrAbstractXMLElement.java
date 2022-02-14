package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

public abstract class ErrAbstractXMLElement extends XMLElement {
	
	public static final String valueAttributeName = "value";
	
	private String valueAttributeValue;

	public ErrAbstractXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		valueAttributeValue = attributes.getValue(valueAttributeName);
	}
	
	public String getValueAttributeValue() {
		return valueAttributeValue;
	}
	
}
