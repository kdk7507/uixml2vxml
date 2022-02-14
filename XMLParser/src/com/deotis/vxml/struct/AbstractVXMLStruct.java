package com.deotis.vxml.struct;

import com.deotis.vxml.visitor.VXMLStructVisitor;

public abstract class AbstractVXMLStruct {
	
	public abstract void accept(VXMLStructVisitor visitor);
}
