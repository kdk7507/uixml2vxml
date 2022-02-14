package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class CommonStruct extends AbstractVXMLStruct {
	private ServiceCodeStruct serviceCode = new ServiceCodeStruct();
	private ValueStruct value = new ValueStruct();
	private AssignStruct assign = new AssignStruct();
	
	public ServiceCodeStruct getServiceCodeStruct() {
		return serviceCode;
	}
	
	public ValueStruct getValueStruct() {
		return value;
	}
	
	public AssignStruct getAssignStruct() {
		return assign;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}