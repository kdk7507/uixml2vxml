package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class AudioStruct extends AbstractVXMLStruct {
	private String src;
	private String bargeinswitch;
	private String bargeindtmf;
	
	public void setSrc(String src) {
		this.src = src;
	}
	
	public String getSrc() {
		return src;
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
