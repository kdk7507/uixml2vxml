package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class PlayStruct extends AbstractVXMLStruct {

	private String value;
	private String src;
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setSrc(String src) {
		this.src = src;
	}
	
	public String getSrc() {
		return src;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
