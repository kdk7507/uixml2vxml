package com.deotis.vxml.visitor;

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

public interface VXMLStructVisitor {
	public void visit(VXMLStruct struct);
	public void visit(FormStruct struct);
	public void visit(CommonStruct struct);
	public void visit(AssignStruct struct);
	public void visit(AudioStruct struct);
	public void visit(BlockStruct struct);
	public void visit(PlayVoiceStruct struct);
	public void visit(SayasStruct struct);
	public void visit(ServiceCodeStruct struct);
	public void visit(ValueStruct struct);
	public void visit(PlayStruct struct);
	public void visit(JoinStruct struct);
}
