package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class PointXMLElement extends XMLElement {
	
	public static final String xAttributeName = "x";
	public static final String yAttributeName = "y";
	
	private String xAttributeValue;
	private String yAttributeValue;
	
	public PointXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		xAttributeValue = attributes.getValue(xAttributeName);
		yAttributeValue = attributes.getValue(yAttributeName);
	}
	
	public String getXAttributeValue () {
		return xAttributeValue;
	}
	
	public String getYAttributeValue () {
		return yAttributeValue;
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
