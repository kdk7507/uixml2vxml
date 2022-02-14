package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class SayasStruct extends AbstractVXMLStruct {
	private String classV;
	private String speed;
	private String front;
	private String back;
	
	private ValueStruct value = new ValueStruct();
	
	public void setClassV(String classV) {
		this.classV = classV;
	}
	
	public String getClassV() {
		return classV;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public ValueStruct getValue() {
		return value;
	}
	
	public void setFront(String front) {
		this.front = front;
	}
	
	public String getFront() {
		return front;
	}
	
	public void setBack(String back) {
		this.back = back;
	}
	
	public String getBack() {
		return back;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
