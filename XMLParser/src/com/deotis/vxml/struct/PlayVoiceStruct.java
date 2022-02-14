package com.deotis.vxml.struct;

import java.util.ArrayList;
import java.util.List;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class PlayVoiceStruct extends ActionStruct {

	private List<ValueStruct> valueList = new ArrayList<ValueStruct>();
	private BlockStruct block = new BlockStruct();
	
	private String bargeinswitch;
	private String bargeindtmf;
	
	public PlayVoiceStruct() {
		
	}
	
	public void addValueStruct(ValueStruct value) {
		valueList.add(value);
	}
	
	public int getValueStructSize() {
		return valueList.size();
	}
	
	public ValueStruct getValueStruct(int i) {
		return valueList.get(i);
	}
	
	public BlockStruct getBlockStruct() {
		return block;
	}
	
	public void setBargeinswitch(String bargeinswitch) {
		this.bargeinswitch = bargeinswitch;
	}
	
	public String getBargeinswitch() {
		return bargeinswitch;
	}
	
	public void setBargeindtmf(String bargeindtmf) {
		this.bargeindtmf = bargeindtmf;
	}
	
	public String getBargeindtmf() {
		return bargeindtmf;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
