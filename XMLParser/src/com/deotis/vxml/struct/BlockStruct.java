package com.deotis.vxml.struct;

import java.util.ArrayList;
import java.util.List;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class BlockStruct extends AbstractVXMLStruct {
	private String clear;
	
	private List<AbstractVXMLStruct> blockList = new ArrayList<AbstractVXMLStruct> ();
	
	public void setClear(String clear) {
		this.clear = clear;
	}
	
	public String getClear() {
		return clear;
	}
	
	public void addVXMLStruct(AbstractVXMLStruct vxmlStruct) {
		blockList.add(vxmlStruct);
	}
	
	public int getBlockListSize() {
		return blockList.size();
	}
	
	public AbstractVXMLStruct getBlock(int i) {
		return blockList.get(i);
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
