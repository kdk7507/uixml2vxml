package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class UnkownedXMLElement extends XMLElement {
	
	private AttributesImpl attributes = null;
	private String elementName;
	
	public UnkownedXMLElement(String elementName, Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		this.attributes = new AttributesImpl(attributes);
		this.elementName = elementName;
	}
	
	public String getElementName() {
		return elementName;
	}
	
	public AttributesImpl getAttributes() {
		return attributes;
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
