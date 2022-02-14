package com.deotis.uixmlpaser.visitor;

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

public class UIXMLPrintVisitor implements UIXMLVisitor {

	@Override
	public void visit(ScenarioXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ScenarioXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(TablesXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("TablesXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(TableXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("TableXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(LinkXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("LinkXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(PointXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("PointXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(ComponentsXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ComponentsXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(Start4XMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("Start4XMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(PlayVoice4XMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("PlayVoice4XMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(CommonXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("CommonXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemkeyXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemkeyXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemkindXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemkindXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemnameXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemnameXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemservicecodeXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemservicecodeXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemservicenameXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemservicenameXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemtextXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemtextXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemLocationMemoryXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemLocationMemoryXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemPreviousMemoryXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemPreviousMemoryXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemPushMemoryIdxXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemPushMemoryIdxXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemAssignServiceCodeXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemAssignServiceCodeXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemAddUserVxmlXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemAddUserVxmlXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemCTILinkXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemCTILinkXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemDigitAtServiceXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemDigitAtServiceXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemReasonAtServiceXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemReasonAtServiceXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemQueueNumToAgentXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemQueueNumToAgentXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemPopupInfoToAgentXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemPopupInfoToAgentXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemDNXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemDNXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemANIXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ItemANIXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(PlayVoiceXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("PlayVoiceXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(AsyncXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("AsyncXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(BargeinDTMFXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("BargeinDTMFXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ClearDTMFXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ClearDTMFXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(BargeinSwitchXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("BargeinSwitchXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(SelectVoiceXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("SelectVoiceXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(SelectVoiceCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("SelectVoiceCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(ErrXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrMaxTimeXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrMaxTimeXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrMaxCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrMaxCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrInputXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrInputXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrInputCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrInputCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrCountOverXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrCountOverXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrCountOverCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrCountOverCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrTimeOverXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrTimeOverXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrTimeOverCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrTimeOverCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrLastBargeinXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrLastBargeinXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrProcessXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrProcessXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrLinkScenarioXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrLinkScenarioXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrDigitXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrDigitXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrDigitVoiceXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrDigitVoiceXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrDigitVoiceCountXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrDigitVoiceCountXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrInputAddVxmlXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrInputAddVxmlXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrTimeAddVxmlXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrTimeAddVxmlXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrCountAddVxmlXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrCountAddVxmlXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ErrDigitAddVxmlXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("ErrDigitAddVxmlXMLElement");
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
	
	@Override
	public void visit(UnkownedXMLElement element) {
		// TODO Auto-generated method stub
		System.out.println("UnkownedXMLElement : " + element.getElementName());
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}
}
