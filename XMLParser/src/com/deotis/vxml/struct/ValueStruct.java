package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class ValueStruct extends AbstractVXMLStruct{
	
	private String name;
	private String expr;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setExpr(String expr) {
		this.expr = expr;
	}
	
	public String getExpr() {
		return expr;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}