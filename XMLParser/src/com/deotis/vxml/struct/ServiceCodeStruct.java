package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public class ServiceCodeStruct extends AbstractVXMLStruct {
	private String name;
	private String desc;
	private String traceinfo;
	private String dn;
	private String ani;
	private String digits;
	private String reason;
	private String dest;
	private String uui;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setTraceinfo(String traceinfo) {
		this.traceinfo = traceinfo;
	}
	
	public String getTraceinfo() {
		return traceinfo;
	}
	
	public void setDn(String dn) {
		this.dn = dn;
	}
	
	public String getDn() {
		return dn;
	}
	
	public void setAni(String ani) {
		this.ani = ani;
	}
	
	public String getAni() {
		return ani;
	}
	
	public void setDigits(String digits) {
		this.digits = digits;
	}
	
	public String getDigits() {
		return digits;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setUui(String uui) {
		this.uui = uui;
	}
	
	public String getUui() {
		return uui;
	}

	@Override
	public void accept(VXMLStructVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}