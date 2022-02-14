package com.deotis.uixmlpaser.saxhandler;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import com.deotis.uixmlpaser.element.AsyncXMLElement;
import com.deotis.uixmlpaser.element.BargeinDTMFXMLElement;
import com.deotis.uixmlpaser.element.BargeinSwitchXMLElement;
import com.deotis.uixmlpaser.element.ClearDTMFXMLElement;
import com.deotis.uixmlpaser.element.CommonXMLElement;
import com.deotis.uixmlpaser.element.ComponentsXMLElement;
import com.deotis.uixmlpaser.element.ErrCountAddVxmlXMLElement;
import com.deotis.uixmlpaser.element.ErrCountOverCountXMLElement;
import com.deotis.uixmlpaser.element.ErrCountOverXMLElement;
import com.deotis.uixmlpaser.element.ErrDigitAddVxmlXMLElement;
import com.deotis.uixmlpaser.element.ErrDigitVoiceCountXMLElement;
import com.deotis.uixmlpaser.element.ErrDigitVoiceXMLElement;
import com.deotis.uixmlpaser.element.ErrDigitXMLElement;
import com.deotis.uixmlpaser.element.ErrInputAddVxmlXMLElement;
import com.deotis.uixmlpaser.element.ErrInputCountXMLElement;
import com.deotis.uixmlpaser.element.ErrInputXMLElement;
import com.deotis.uixmlpaser.element.ErrLastBargeinXMLElement;
import com.deotis.uixmlpaser.element.ErrLinkScenarioXMLElement;
import com.deotis.uixmlpaser.element.ErrMaxCountXMLElement;
import com.deotis.uixmlpaser.element.ErrMaxTimeXMLElement;
import com.deotis.uixmlpaser.element.ErrProcessXMLElement;
import com.deotis.uixmlpaser.element.ErrTimeAddVxmlXMLElement;
import com.deotis.uixmlpaser.element.ErrTimeOverCountXMLElement;
import com.deotis.uixmlpaser.element.ErrTimeOverXMLElement;
import com.deotis.uixmlpaser.element.ErrXMLElement;
import com.deotis.uixmlpaser.element.ItemANIXMLElement;
import com.deotis.uixmlpaser.element.ItemAddUserVxmlXMLElement;
import com.deotis.uixmlpaser.element.ItemAssignServiceCodeXMLElement;
import com.deotis.uixmlpaser.element.ItemCTILinkXMLElement;
import com.deotis.uixmlpaser.element.ItemDNXMLElement;
import com.deotis.uixmlpaser.element.ItemDigitAtServiceXMLElement;
import com.deotis.uixmlpaser.element.ItemLocationMemoryXMLElement;
import com.deotis.uixmlpaser.element.ItemPopupInfoToAgentXMLElement;
import com.deotis.uixmlpaser.element.ItemPreviousMemoryXMLElement;
import com.deotis.uixmlpaser.element.ItemPushMemoryIdxXMLElement;
import com.deotis.uixmlpaser.element.ItemQueueNumToAgentXMLElement;
import com.deotis.uixmlpaser.element.ItemReasonAtServiceXMLElement;
import com.deotis.uixmlpaser.element.ItemkeyXMLElement;
import com.deotis.uixmlpaser.element.ItemkindXMLElement;
import com.deotis.uixmlpaser.element.ItemnameXMLElement;
import com.deotis.uixmlpaser.element.ItemservicecodeXMLElement;
import com.deotis.uixmlpaser.element.ItemservicenameXMLElement;
import com.deotis.uixmlpaser.element.ItemtextXMLElement;
import com.deotis.uixmlpaser.element.LinkXMLElement;
import com.deotis.uixmlpaser.element.PlayVoice4XMLElement;
import com.deotis.uixmlpaser.element.PlayVoiceXMLElement;
import com.deotis.uixmlpaser.element.PointXMLElement;
import com.deotis.uixmlpaser.element.ScenarioXMLElement;
import com.deotis.uixmlpaser.element.SelectVoiceCountXMLElement;
import com.deotis.uixmlpaser.element.SelectVoiceXMLElement;
import com.deotis.uixmlpaser.element.Start4XMLElement;
import com.deotis.uixmlpaser.element.TableXMLElement;
import com.deotis.uixmlpaser.element.TablesXMLElement;
import com.deotis.uixmlpaser.element.UnkownedXMLElement;
import com.deotis.uixmlpaser.element.XMLElement;

public class UIXMLHandler extends DefaultHandler {
	
	private XMLElement rootElement = null;
	private Stack<XMLElement> xmlNodeStack = new Stack<XMLElement> ();
	
	public void startDocument() {
		System.out.println("start document");
	}
	
	public void endDocument() {
		System.out.println("end document");
		if(!xmlNodeStack.isEmpty()) {
			System.out.println("parse error");
		}else {
		}
	}
	
	public void startElement(String uri, String localName, String name, Attributes attributes) {
//		System.out.println("uri : " + uri);
//		System.out.println("localName : " + localName);
//		System.out.println("name : " + name);
		
		XMLElement currentElement = null;
		
		if(name.equals(XMLElement.scenarioElementName)) {
			currentElement = new ScenarioXMLElement(attributes);
		}else if(name.equals(XMLElement.tablesElementName)) {
			currentElement = new TablesXMLElement(attributes);
		}else if(name.equals(XMLElement.tableElementName)) {
			currentElement = new TableXMLElement(attributes);
		}else if(name.equals(XMLElement.linkElementName)) {
			currentElement = new LinkXMLElement(attributes);
		}else if(name.equals(XMLElement.pointElementName)) {
			currentElement = new PointXMLElement(attributes);
		}else if(name.equals(XMLElement.componentsElementName)) {
			currentElement = new ComponentsXMLElement(attributes);
		}else if(name.equals(XMLElement.start4ElementName)) {
			currentElement = new Start4XMLElement(attributes);
		}else if(name.equals(XMLElement.playVoice4ElementName)) {
			currentElement = new PlayVoice4XMLElement(attributes);
		}else if(name.equals(XMLElement.commonElementName)) {
			currentElement = new CommonXMLElement(attributes);
		}else if(name.equals(XMLElement.itemkeyElementName)) {
			currentElement = new ItemkeyXMLElement(attributes);
		}else if(name.equals(XMLElement.itemkindElementName)) {
			currentElement = new ItemkindXMLElement(attributes);
		}else if(name.equals(XMLElement.itemnameElementName)) {
			currentElement = new ItemnameXMLElement(attributes);
		}else if(name.equals(XMLElement.itemservicecodeElementName)) {
			currentElement = new ItemservicecodeXMLElement(attributes);
		}else if(name.equals(XMLElement.itemservicenameElementName)) {
			currentElement = new ItemservicenameXMLElement(attributes);
		}else if(name.equals(XMLElement.itemtextElementName)) {
			currentElement = new ItemtextXMLElement(attributes);
		}else if(name.equals(XMLElement.itemLocationMemoryElementName)) {
			currentElement = new ItemLocationMemoryXMLElement(attributes);
		}else if(name.equals(XMLElement.itemPreviousMemoryElementName)) {
			currentElement = new ItemPreviousMemoryXMLElement(attributes);
		}else if(name.equals(XMLElement.itemPushMemoryIdxElementName)) {
			currentElement = new ItemPushMemoryIdxXMLElement(attributes);
		}else if(name.equals(XMLElement.itemAssignServiceCodeElementName)) {
			currentElement = new ItemAssignServiceCodeXMLElement(attributes);
		}else if(name.equals(XMLElement.itemAddUserVxmlElementName)) {
			currentElement = new ItemAddUserVxmlXMLElement(attributes);
		}else if(name.equals(XMLElement.itemCTILinkElementName)) {
			currentElement = new ItemCTILinkXMLElement(attributes);
		}else if(name.equals(XMLElement.itemDigitAtServiceElementName)) {
			currentElement = new ItemDigitAtServiceXMLElement(attributes);
		}else if(name.equals(XMLElement.itemReasonAtServiceElementName)) {
			currentElement = new ItemReasonAtServiceXMLElement(attributes);
		}else if(name.equals(XMLElement.itemQueueNumToAgentElementName)) {
			currentElement = new ItemQueueNumToAgentXMLElement(attributes);
		}else if(name.equals(XMLElement.itemPopupInfoToAgentElementName)) {
			currentElement = new ItemPopupInfoToAgentXMLElement(attributes);
		}else if(name.equals(XMLElement.itemDNElementName)) {
			currentElement = new ItemDNXMLElement(attributes);
		}else if(name.equals(XMLElement.itemANIElementName)) {
			currentElement = new ItemANIXMLElement(attributes);
		}else if(name.equals(XMLElement.playVoiceElementName)) {
			currentElement = new PlayVoiceXMLElement(attributes);
		}else if(name.equals(XMLElement.asyncElementName)) {
			currentElement = new AsyncXMLElement(attributes);
		}else if(name.equals(XMLElement.bargeinDTMFElementName)) {
			currentElement = new BargeinDTMFXMLElement(attributes);
		}else if(name.equals(XMLElement.clearDTMFElementName)) {
			currentElement = new ClearDTMFXMLElement(attributes);
		}else if(name.equals(XMLElement.bargeinSwitchElementName)) {
			currentElement = new BargeinSwitchXMLElement(attributes);
		}else if(name.equals(XMLElement.selectVoiceElementName)) {
			currentElement = new SelectVoiceXMLElement(attributes);
		}else if(name.equals(XMLElement.selectVoiceCountElementName)) {
			currentElement = new SelectVoiceCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errElementName)) {
			currentElement = new ErrXMLElement(attributes);
		}else if(name.equals(XMLElement.errMaxTimeElementName)) {
			currentElement = new ErrMaxTimeXMLElement(attributes);
		}else if(name.equals(XMLElement.errMaxCountElementName)) {
			currentElement = new ErrMaxCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errInputElementName)) {
			currentElement = new ErrInputXMLElement(attributes);
		}else if(name.equals(XMLElement.errInputCountElementName)) {
			currentElement = new ErrInputCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errCountOverElementName)) {
			currentElement = new ErrCountOverXMLElement(attributes);
		}else if(name.equals(XMLElement.errCountOverCountElementName)) {
			currentElement = new ErrCountOverCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errTimeOverElementName)) {
			currentElement = new ErrTimeOverXMLElement(attributes);
		}else if(name.equals(XMLElement.errTimeOverCountElementName)) {
			currentElement = new ErrTimeOverCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errLastBargeinElementName)) {
			currentElement = new ErrLastBargeinXMLElement(attributes);
		}else if(name.equals(XMLElement.errProcessElementName)) {
			currentElement = new ErrProcessXMLElement(attributes);
		}else if(name.equals(XMLElement.errLinkScenarioElementName)) {
			currentElement = new ErrLinkScenarioXMLElement(attributes);
		}else if(name.equals(XMLElement.errDigitElementName)) {
			currentElement = new ErrDigitXMLElement(attributes);
		}else if(name.equals(XMLElement.errDigitVoiceElementName)) {
			currentElement = new ErrDigitVoiceXMLElement(attributes);
		}else if(name.equals(XMLElement.errDigitVoiceCountElementName)) {
			currentElement = new ErrDigitVoiceCountXMLElement(attributes);
		}else if(name.equals(XMLElement.errInputAddVxmlElementName)) {
			currentElement = new ErrInputAddVxmlXMLElement(attributes);
		}else if(name.equals(XMLElement.errTimeAddVxmlElementName)) {
			currentElement = new ErrTimeAddVxmlXMLElement(attributes);
		}else if(name.equals(XMLElement.errCountAddVxmlElementName)) {
			currentElement = new ErrCountAddVxmlXMLElement(attributes);
		}else if(name.equals(XMLElement.errDigitAddVxmlElementName)) {
			currentElement = new ErrDigitAddVxmlXMLElement(attributes);
		}else {
			currentElement = new UnkownedXMLElement(name, attributes);
		}
		
		if(rootElement == null) {
			rootElement = currentElement;
		}else {
			xmlNodeStack.peek().addChild(currentElement);
		}
		xmlNodeStack.push(currentElement);
	}
	
	public void endElement(String uri, String localName, String name) {
//		System.out.println("end Element : " + name);
		xmlNodeStack.pop();
	}
	
	public XMLElement getRootElement() {
		return rootElement;
	}
}
