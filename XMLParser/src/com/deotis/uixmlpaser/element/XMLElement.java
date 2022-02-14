package com.deotis.uixmlpaser.element;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public abstract class XMLElement {

	public static final String scenarioElementName = "Scenario";
	public static final String tablesElementName = "tables";
	public static final String tableElementName = "table";
	public static final String linkElementName = "Link";
	public static final String pointElementName = "Point";
	
	public static final String componentsElementName = "Components";
	public static final String start4ElementName = "START4";
	public static final String playVoice4ElementName = "PLAYVOICE4";
	
	public static final String commonElementName = "COMMON";
	public static final String itemkeyElementName = "itemkey";
	public static final String itemkindElementName = "itemkind";
	public static final String itemnameElementName = "itemname";
	public static final String itemservicecodeElementName = "itemservicecode";
	public static final String itemservicenameElementName = "itemservicename";
	public static final String itemtextElementName = "itemtext";
	public static final String itemLocationMemoryElementName = "itemLocationMemory";
	public static final String itemPreviousMemoryElementName = "itemPreviousMemory";
	public static final String itemPushMemoryIdxElementName = "itemPushMemoryIdx";
	public static final String itemAssignServiceCodeElementName = "itemAssignServiceCode";
	public static final String itemAddUserVxmlElementName = "itemAddUserVxml";
	public static final String itemCTILinkElementName = "itemCTILink";
	public static final String itemDigitAtServiceElementName = "itemDigitAtService";
	public static final String itemReasonAtServiceElementName = "itemReasonAtService";
	public static final String itemQueueNumToAgentElementName = "itemQueueNumToAgent";
	public static final String itemPopupInfoToAgentElementName = "itemPopupInfoToAgent";
	public static final String itemDNElementName = "itemDN";
	public static final String itemANIElementName = "itemANI";
	
	public static final String playVoiceElementName = "PLAYVOICE";
	public static final String asyncElementName = "Async";
	public static final String bargeinDTMFElementName = "BargeinDTMF";
	public static final String clearDTMFElementName = "ClearDTMF";
	public static final String bargeinSwitchElementName = "BargeinSwitch";
	public static final String selectVoiceElementName = "SelectVoice";
	public static final String selectVoiceCountElementName = "SelectVoiceCount";
	
	public static final String errElementName = "ERR";
	public static final String errMaxTimeElementName = "ErrMaxTime";
	public static final String errMaxCountElementName = "ErrMaxCount";
	public static final String errInputElementName = "ErrInput";
	public static final String errInputCountElementName = "ErrInputCount";
	public static final String errCountOverElementName = "ErrCountOver";
	public static final String errCountOverCountElementName = "ErrCountOverCount";
	public static final String errTimeOverElementName = "ErrTimeOver";
	public static final String errTimeOverCountElementName = "ErrTimeOverCount";
	public static final String errLastBargeinElementName = "ErrLastBargein";
	public static final String errProcessElementName = "ErrProcess";
	public static final String errLinkScenarioElementName = "ErrLinkScenario";
	public static final String errDigitElementName = "ErrDigit";
	public static final String errDigitVoiceElementName = "ErrDigitVoice";
	public static final String errDigitVoiceCountElementName = "ErrDigitVoiceCount";
	public static final String errInputAddVxmlElementName = "ErrInputAddVxml";
	public static final String errTimeAddVxmlElementName = "ErrTimeAddVxml";
	public static final String errCountAddVxmlElementName = "ErrCountAddVxml";
	public static final String errDigitAddVxmlElementName = "ErrDigitAddVxml";
	
	private List<XMLElement> children = new ArrayList<XMLElement>();
	
	public XMLElement (Attributes attributes) {
		
	}
	
	public void addChild(XMLElement xmlNode) {
		children.add(xmlNode);
	}
	
	public int getChildrenSize() {
		return children.size();
	}
	
	public XMLElement getChild(int i) {
		return children.get(i);
	}
	
	public abstract void accept(UIXMLVisitor visitor);
}
