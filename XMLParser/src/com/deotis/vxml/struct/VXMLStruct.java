package com.deotis.vxml.struct;

import java.util.ArrayList;
import java.util.List;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class VXMLStruct extends AbstractVXMLStruct {
	
	private List<FormStruct> formStructList = new ArrayList<FormStruct>();
	
	public void addFormStruct(FormStruct formStruct) {
		formStructList.add(formStruct);
	}
	
	public int getFormStructListSize() {
		return formStructList.size();
	}
	
	public FormStruct getFormStruct(int i) {
		return formStructList.get(i);
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
