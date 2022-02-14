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
import com.deotis.vxml.struct.ActionStruct;
import com.deotis.vxml.struct.AudioStruct;
import com.deotis.vxml.struct.CommonStruct;
import com.deotis.vxml.struct.FormStruct;
import com.deotis.vxml.struct.JoinStruct;
import com.deotis.vxml.struct.PlayStruct;
import com.deotis.vxml.struct.PlayVoiceStruct;
import com.deotis.vxml.struct.SayasStruct;
import com.deotis.vxml.struct.VXMLStruct;

public class UIXML2VXMLVisitor implements UIXMLVisitor {
	
	private VXMLStruct vxmlStruct = new VXMLStruct();
	private FormStruct currentFormStruct = null;
	
	public VXMLStruct getVXMLStruct() {
		return vxmlStruct;
	}

	@Override
	public void visit(ScenarioXMLElement element) {
		// TODO Auto-generated method stub
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(TablesXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(TableXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LinkXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PointXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ComponentsXMLElement element) {
		// TODO Auto-generated method stub
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(Start4XMLElement element) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void visit(PlayVoice4XMLElement element) {
		// TODO Auto-generated method stub
		if(currentFormStruct != null) {
			System.err.println("currentFormStruct is not null");
		}else {}
		currentFormStruct = new FormStruct();
		
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
		
		vxmlStruct.addFormStruct(currentFormStruct);
		currentFormStruct = null;
	}
	
	@Override
	public void visit(CommonXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.setCommonStruct(new CommonStruct());
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(ItemkeyXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.setId(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemkindXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemnameXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemservicecodeXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setName(element.getValueAttributeValue());
		currentFormStruct.getCommonStruct().getAssignStruct().setExpr(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemservicenameXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setDesc(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemtextXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemLocationMemoryXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.setMemory(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemPreviousMemoryXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemPushMemoryIdxXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemAssignServiceCodeXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getValueStruct().setName(element.getValueAttributeValue());
		currentFormStruct.getCommonStruct().getAssignStruct().setName(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemAddUserVxmlXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ItemCTILinkXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setTraceinfo(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemDigitAtServiceXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setDigits(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemReasonAtServiceXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setReason(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemQueueNumToAgentXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setDest(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemPopupInfoToAgentXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setUui(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemDNXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setDn(element.getValueAttributeValue());
	}

	@Override
	public void visit(ItemANIXMLElement element) {
		// TODO Auto-generated method stub
		currentFormStruct.getCommonStruct().getServiceCodeStruct().setAni(element.getValueAttributeValue());
	}

	@Override
	public void visit(PlayVoiceXMLElement element) {
		// TODO Auto-generated method stub
		PlayVoiceStruct playVoiceActionStruct = new PlayVoiceStruct();
		currentFormStruct.setActionStruct(playVoiceActionStruct);
		
		for(int i = 0; i < element.getChildrenSize(); i++) {
			element.getChild(i).accept(this);
		}
	}

	@Override
	public void visit(AsyncXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(BargeinDTMFXMLElement element) {
		// TODO Auto-generated method stub
		ActionStruct actionStruct = currentFormStruct.getActionStruct();
		if(actionStruct instanceof PlayVoiceStruct) {
			PlayVoiceStruct playVoiceStruct = (PlayVoiceStruct) actionStruct;
			playVoiceStruct.setBargeindtmf(element.getValueAttributeValue());
		}else {}
	}

	@Override
	public void visit(ClearDTMFXMLElement element) {
		// TODO Auto-generated method stub
		ActionStruct actionStruct = currentFormStruct.getActionStruct();
		if(actionStruct instanceof PlayVoiceStruct) {
			PlayVoiceStruct playVoiceStruct = (PlayVoiceStruct) actionStruct;
			playVoiceStruct.getBlockStruct().setClear(element.getValueAttributeValue());
		}else {}
	}

	@Override
	public void visit(BargeinSwitchXMLElement element) {
		// TODO Auto-generated method stub
		ActionStruct actionStruct = currentFormStruct.getActionStruct();
		if(actionStruct instanceof PlayVoiceStruct) {
			PlayVoiceStruct playVoiceStruct = (PlayVoiceStruct) actionStruct;
			playVoiceStruct.setBargeinswitch(element.getValueAttributeValue());
		}else {}
	}

	@Override
	public void visit(SelectVoiceXMLElement element) {
		// TODO Auto-generated method stub
		ActionStruct actionStruct = currentFormStruct.getActionStruct();
		if(actionStruct instanceof PlayVoiceStruct) {
			PlayVoiceStruct playVoiceStruct = (PlayVoiceStruct) actionStruct;
			for(int i = 0; i < element.getAudioPlayInfoListSize(); i++) {
				SelectVoiceXMLElement.AudioPlayInfo audioPlayInfo = element.getAudioPlayInfo(i);
				if(audioPlayInfo instanceof SelectVoiceXMLElement.AudioFilePlayInfo) {
					AudioStruct audioStruct = new AudioStruct();
					audioStruct.setSrc(audioPlayInfo.getAudioInfo());
					audioStruct.setBargeinswitch(playVoiceStruct.getBargeinswitch());
					audioStruct.setBargeindtmf(playVoiceStruct.getBargeindtmf());
					playVoiceStruct.getBlockStruct().addVXMLStruct(audioStruct);
				}else if(audioPlayInfo instanceof SelectVoiceXMLElement.TTSPlayInfo) {
					SayasStruct sayasStruct = new SayasStruct();
					sayasStruct.setClassV(audioPlayInfo.getType());
					sayasStruct.setSpeed(audioPlayInfo.getSpeed());
					sayasStruct.getValue().setExpr(audioPlayInfo.getAudioInfo());
					playVoiceStruct.getBlockStruct().addVXMLStruct(sayasStruct);
				}else if(audioPlayInfo instanceof SelectVoiceXMLElement.TTSValuePlayInfo) {
					SelectVoiceXMLElement.TTSValuePlayInfo ttsValuePlayInfo = (SelectVoiceXMLElement.TTSValuePlayInfo) audioPlayInfo;
					SayasStruct sayasStruct = new SayasStruct();
					sayasStruct.setClassV(ttsValuePlayInfo.getType());
					sayasStruct.setFront(ttsValuePlayInfo.getFront());
					sayasStruct.setBack(ttsValuePlayInfo.getBack());
					sayasStruct.getValue().setExpr(ttsValuePlayInfo.getValue());
					playVoiceStruct.getBlockStruct().addVXMLStruct(sayasStruct);
				}else if(audioPlayInfo instanceof SelectVoiceXMLElement.ValuePlayInfo) {
					JoinStruct joinStruct = new JoinStruct();
					joinStruct.setName(audioPlayInfo.getCode());
					joinStruct.setValue(audioPlayInfo.getAudioInfo());
					joinStruct.setExtension("." + audioPlayInfo.getType());
					PlayStruct playStruct = new PlayStruct();
					playStruct.setValue(audioPlayInfo.getCode());
					playStruct.setSrc(audioPlayInfo.getValueName());
					playVoiceStruct.getBlockStruct().addVXMLStruct(joinStruct);
					playVoiceStruct.getBlockStruct().addVXMLStruct(playStruct);
				}else {}
			}
		}else {
			
		}
	}

	@Override
	public void visit(SelectVoiceCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrMaxTimeXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrMaxCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrInputXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrInputCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrCountOverXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrCountOverCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrTimeOverXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrTimeOverCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrLastBargeinXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrProcessXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrLinkScenarioXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrDigitXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrDigitVoiceXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrDigitVoiceCountXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrInputAddVxmlXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrTimeAddVxmlXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrCountAddVxmlXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ErrDigitAddVxmlXMLElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(UnkownedXMLElement element) {
		// TODO Auto-generated method stub

	}

}
