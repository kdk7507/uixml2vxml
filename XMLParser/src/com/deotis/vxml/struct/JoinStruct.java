package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class JoinStruct extends AbstractVXMLStruct {

	private String name;
	private String value;
	private String extension;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String getExtension() {
		return extension;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
