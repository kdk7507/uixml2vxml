package com.deotis.vxml.visitor;

import java.io.OutputStream;
import java.io.PrintStream;

import com.deotis.vxml.struct.AssignStruct;
import com.deotis.vxml.struct.AudioStruct;
import com.deotis.vxml.struct.BlockStruct;
import com.deotis.vxml.struct.CommonStruct;
import com.deotis.vxml.struct.FormStruct;
import com.deotis.vxml.struct.JoinStruct;
import com.deotis.vxml.struct.PlayStruct;
import com.deotis.vxml.struct.PlayVoiceStruct;
import com.deotis.vxml.struct.SayasStruct;
import com.deotis.vxml.struct.ServiceCodeStruct;
import com.deotis.vxml.struct.VXMLStruct;
import com.deotis.vxml.struct.ValueStruct;

public class VXMLPrintVisitor implements VXMLStructVisitor {
	
	private PrintStream out;
	
	public VXMLPrintVisitor(OutputStream out) {
		this.out = new PrintStream(out);
	}

	@Override
	public void visit(VXMLStruct struct) {
		// TODO Auto-generated method stub
		out.println("<?xml version=\"1.0\" encoding=\"euc-kr\"?>");
		out.println("<vxml version=\"2.0\">");
		for(int i = 0; i < struct.getFormStructListSize(); i++) {
			struct.getFormStruct(i).accept(this);
		}
		out.println("</vxml>");
	}

	@Override
	public void visit(FormStruct struct) {
		// TODO Auto-generated method stub
		out.print("<form ");
		if(struct.getId() != null && !struct.getId().trim().isEmpty()) {
			out.print("id=\"" + struct.getId() + "\" ");
		}else {}
		if(struct.getMemory() != null && !struct.getMemory().trim().isEmpty()) {
			out.print("memory=\"" + struct.getMemory() + "\" ");
		}else {}
		out.println(">");
		struct.getCommonStruct().accept(this);
		struct.getActionStruct().accept(this);
		out.println("</form>");
	}

	@Override
	public void visit(CommonStruct struct) {
		// TODO Auto-generated method stub
		struct.getServiceCodeStruct().accept(this);
		struct.getValueStruct().accept(this);
		struct.getAssignStruct().accept(this);
	}

	@Override
	public void visit(AssignStruct struct) {
		// TODO Auto-generated method stub
		out.print("<assign ");
		if(struct.getName() != null && !struct.getName().trim().isEmpty()) {
			out.print("name=\"" + struct.getName() + "\" ");
		}else {}
		if(struct.getExpr() != null && !struct.getExpr().trim().isEmpty()) {
			out.print("expr=\"" + struct.getExpr() + "\" ");
		}else {}
		out.println("/>");
	}

	@Override
	public void visit(AudioStruct struct) {
		// TODO Auto-generated method stub
		out.print("<audio ");
		if(struct.getSrc() != null && !struct.getSrc().trim().isEmpty()) {
			out.print("src=\"" + struct.getSrc() + "\" ");
		}else {}
		if(struct.getBargeinswitch() != null && !struct.getBargeinswitch().trim().isEmpty()) {
			out.print("baregeinswitch=\"" + struct.getBargeinswitch() + "\" ");
		}else {}
		if(struct.getBargeindtmf() != null && !struct.getBargeindtmf().trim().isEmpty()) {
			out.print("bargeindtmf=\"" + struct.getBargeindtmf() + "\" ");
		}else {}
		out.println("/>");
	}

	@Override
	public void visit(BlockStruct struct) {
		// TODO Auto-generated method stub
		out.println("<block clear=\"" + struct.getClear() + "\">");
		for(int i = 0; i < struct.getBlockListSize(); i++) {
			struct.getBlock(i).accept(this);
		}
		out.println("</block>");
	}

	@Override
	public void visit(PlayVoiceStruct struct) {
		// TODO Auto-generated method stub
		for(int i = 0; i < struct.getValueStructSize(); i++) {
			struct.getValueStruct(i).accept(this);
		}
		struct.getBlockStruct().accept(this);
	}

	@Override
	public void visit(SayasStruct struct) {
		// TODO Auto-generated method stub
		out.print("<sayas ");
		if(struct.getClassV() != null && !struct.getClassV().trim().isEmpty()) {
			out.print("class=\"" + struct.getClassV() + "\" ");
		}else {}
		if(struct.getFront() != null && !struct.getFront().trim().isEmpty()) {
			out.print("front=\"" + struct.getFront() + "\" ");
		}else {}
		if(struct.getBack() != null && !struct.getBack().trim().isEmpty()) {
			out.print("back=\"" + struct.getBack() + "\" ");
		}else {}
		out.println(">");
		struct.getValue().accept(this);
		out.println("</sayas>");
	}

	@Override
	public void visit(ServiceCodeStruct struct) {
		// TODO Auto-generated method stub
		out.print("<servicecode ");
		if(struct.getName() != null && !struct.getName().trim().isEmpty()) {
			out.print("name=\"" + struct.getName() + "\" ");
		}else {}
		if(struct.getDesc() != null && !struct.getDesc().trim().isEmpty()) {
			out.print("desc=\"" + struct.getDesc() + "\" ");
		}else {}
		if(struct.getTraceinfo() != null && !struct.getTraceinfo().trim().isEmpty()) {
			out.print("traceinfo=\"" + struct.getTraceinfo() + "\" ");
		}else {}
		if(struct.getDn() != null && !struct.getDn().trim().isEmpty()) {
			out.print("dn=\"" + struct.getDn() + "\" ");
		}else {}
		if(struct.getAni() != null && !struct.getAni().trim().isEmpty()) {
			out.print("ani=\"" + struct.getAni() + "\" ");
		}else {}
		if(struct.getDigits() != null && !struct.getDigits().trim().isEmpty()) {
			out.print("digits=\"" + struct.getDigits() + "\" ");
		}else {}
		if(struct.getReason() != null && !struct.getReason().trim().isEmpty()) {
			out.print("reason=\"" + struct.getReason() + "\" ");
		}else {}
		if(struct.getDest() != null && !struct.getDest().trim().isEmpty()) {
			out.print("dest=\"" + struct.getDest() + "\" ");
		}else {}
		if(struct.getUui() != null && !struct.getUui().trim().isEmpty()) {
			out.print("uui=\"" + struct.getUui() + "\" ");
		}else {}
		out.println("/>");
	}

	@Override
	public void visit(ValueStruct struct) {
		// TODO Auto-generated method stub
		out.print("<value ");
		if(struct.getName() != null && !struct.getName().trim().isEmpty()) {
			out.print("name=\"" + struct.getName() + "\" ");
		}else {}
		if(struct.getExpr() != null && !struct.getExpr().trim().isEmpty()) {
			out.print("expr=\"" + struct.getExpr() + "\" ");
		}else {}
		out.println("/>");
	}

	@Override
	public void visit(PlayStruct struct) {
		// TODO Auto-generated method stub
		out.print("<play ");
		if(struct.getValue() != null && !struct.getValue().trim().isEmpty()) {
			out.print("value=\"" + struct.getValue() + "\" ");
		}else {}
		if(struct.getSrc() != null && !struct.getSrc().trim().isEmpty()) {
			out.print("src=\"" + struct.getSrc() + "\" ");
		}else {}
		out.println("/>");
	}

	@Override
	public void visit(JoinStruct struct) {
		// TODO Auto-generated method stub
		out.print("<join ");
		if(struct.getName() != null && !struct.getName().trim().isEmpty()) {
			out.print("name=\"" + struct.getName() + "\" ");
		}else {}
		if(struct.getValue() != null && !struct.getValue().trim().isEmpty()) {
			out.print("value=\"" + struct.getValue() + "\" ");
		}else {}
		if(struct.getExtension() != null && !struct.getExtension().trim().isEmpty()) {
			out.print("extension=\"" + struct.getExtension() + "\" ");
		}else {}
		out.println("/>");
	}

}
