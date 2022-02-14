package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class FormStruct extends AbstractVXMLStruct {
	
	private String id;
	private String memory;
	
	private CommonStruct common;
	private ActionStruct actionStruct;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	public String getMemory() {
		return memory;
	}
	
	public void setCommonStruct(CommonStruct common) {
		this.common = common;
	}
	
	public CommonStruct getCommonStruct() {
		return common;
	}
	
	public void setActionStruct(ActionStruct actionStruct) {
		this.actionStruct = actionStruct;
	}
	
	public ActionStruct getActionStruct() {
		return actionStruct;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
}