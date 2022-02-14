package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class Start4XMLElement extends XMLElement {
	
	public static final String idAttributeName = "id";
	
	private String idAttributeValue;

	public Start4XMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		idAttributeValue = attributes.getValue(idAttributeName);
	}
	
	public String getIdAttributeValue() {
		return idAttributeValue;
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
