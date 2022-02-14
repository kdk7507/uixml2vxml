package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class ErrLinkScenarioXMLElement extends ErrAbstractXMLElement {

	public ErrLinkScenarioXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
