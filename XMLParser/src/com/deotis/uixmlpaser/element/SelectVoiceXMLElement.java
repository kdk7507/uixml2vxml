package com.deotis.uixmlpaser.element;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class SelectVoiceXMLElement extends ValueAbstractXMLElement {
	
	public abstract class AudioPlayInfo {
		
		public static final int audioFilePlayInfo = 9;
		public static final int ttsPlayInfo = 10;
		public static final int ttsValuePlayInfo = 11;
		public static final int valuePlayInfo = 12;
		
		protected String code;
		protected String order;
		protected String type;
		protected String kind;
		protected String audioInfo;
		protected String valueName;
		protected int inputKindCode;
		protected String inputKind;
		protected String formatRead;
		protected String speed;
		
		public AudioPlayInfo(String code, String order, String type, String kind, String audioInfo, String valueName, int inputKindCode, String inputKind, String formatRead, String speed) {
			this.code = code;
			this.order = order;
			this.type = type;
			this.kind = kind;
			this.audioInfo = audioInfo;
			this.valueName = valueName;
			this.inputKindCode = inputKindCode;
			this.formatRead = formatRead;
			this.speed = speed;
		}
		
		public String getCode() {
			return code;
		}
		
		public String getOrder() {
			return order;
		}
		
		public String getType() {
			return type;
		}
		
		public String getKind() {
			return kind;
		}
		
		public String getAudioInfo() {
			return audioInfo;
		}
		
		public String getValueName() {
			return valueName;
		}
		
		public int getInputKindCode() {
			return inputKindCode;
		}
		
		public String getInputKind() {
			return inputKind;
		}
		
		public String getFormatRead() {
			return formatRead;
		}
		
		public String getSpeed() {
			return speed;
		}
	}
	
	public class AudioFilePlayInfo extends AudioPlayInfo {
		public AudioFilePlayInfo(String code, String order, String type, String kind, String audioInfo, String valueName,
				int inputKindCode, String inputKind, String formatRead, String speed) {
			super(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			// TODO Auto-generated constructor stub
		}
	}
	
	public class TTSPlayInfo extends AudioPlayInfo {

		public TTSPlayInfo(String code, String order, String type, String kind, String audioInfo, String valueName,
				int inputKindCode, String inputKind, String formatRead, String speed) {
			super(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class TTSValuePlayInfo extends AudioPlayInfo {
		
		private String front;
		private String back;
		private String value;

		public TTSValuePlayInfo(String code, String order, String type, String kind, String audioInfo, String valueName,
				int inputKindCode, String inputKind, String formatRead, String speed) {
			super(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			// TODO Auto-generated constructor stub
			String[] barSplitString = audioInfo.split("-");
			if(barSplitString.length >= 3) {
				value = barSplitString[0];
				front = barSplitString[1];
				back = barSplitString[2];
			}else {}
		}
		
		public String getFront() {
			return front;
		}
		
		public String getBack() {
			return back;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	public class ValuePlayInfo extends AudioPlayInfo {

		public ValuePlayInfo(String code, String order, String type, String kind, String audioInfo, String valueName,
				int inputKindCode, String inputKind, String formatRead, String speed) {
			super(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	class AudioPlayInfoBuilder {
		private String code;
		private String order;
		private String type;
		private String kind;
		private String audioInfo;
		private String valueName;
		private int inputKindCode;
		private String inputKind;
		private String formatRead;
		private String speed;
		
		public AudioPlayInfoBuilder setCode(String code) {
			this.code = code;
			return this;
		}
		
		public AudioPlayInfoBuilder setOrder(String order) {
			this.order = order;
			return this;
		}
		
		public AudioPlayInfoBuilder setType(String type) {
			this.type = type;
			return this;
		}
		
		public AudioPlayInfoBuilder setKind(String kind) {
			this.kind = kind;
			return this;
		}
		
		public AudioPlayInfoBuilder setAudioInfo(String audioInfo) {
			this.audioInfo = audioInfo;
			return this;
		}
		
		public AudioPlayInfoBuilder setValueName(String valueName) {
			this.valueName = valueName;
			return this;
		}
		
		public AudioPlayInfoBuilder setInputKindCode(int inputKindCode) {
			this.inputKindCode = inputKindCode;
			return this;
		}
		
		public AudioPlayInfoBuilder setInputKind(String inputKind) {
			this.inputKind = inputKind;
			return this;
		}
		
		public AudioPlayInfoBuilder setFormatRead(String formatRead) {
			this.formatRead = formatRead;
			return this;
		}
		
		public AudioPlayInfoBuilder setSpeed(String speed) {
			this.speed = speed;
			return this;
		}
		
		public AudioPlayInfo build() {
			if(inputKindCode == AudioPlayInfo.audioFilePlayInfo) {
				return new AudioFilePlayInfo(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			}else if(inputKindCode == AudioPlayInfo.ttsPlayInfo) {
				return new TTSPlayInfo(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			}else if(inputKindCode == AudioPlayInfo.ttsValuePlayInfo) {
				return new TTSValuePlayInfo(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			}else if(inputKindCode == AudioPlayInfo.valuePlayInfo) {
				return new ValuePlayInfo(code, order, type, kind, audioInfo, valueName, inputKindCode, inputKind, formatRead, speed);
			}else {
				return null;
			}
		}
	}
	
	List<AudioPlayInfo> audioPlayInfoList = new ArrayList<AudioPlayInfo> ();
	
	public SelectVoiceXMLElement(Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		String[] atSplitString = valueAttributeValue.split("@");
		for(int i = 0; i < atSplitString.length; i++) {
			if(atSplitString[i].trim().length() > 0) {
				String[] barSplitString = atSplitString[i].split("\\|", -1);
				if(barSplitString.length >= 10) {
					AudioPlayInfoBuilder audioPlayInfoBuilder = new AudioPlayInfoBuilder();
					AudioPlayInfo audioPlayInfo = audioPlayInfoBuilder.setCode(barSplitString[0])
							.setOrder(barSplitString[1])
							.setType(barSplitString[2])
							.setKind(barSplitString[3])
							.setAudioInfo(barSplitString[4])
							.setValueName(barSplitString[5])
							.setInputKindCode(Integer.parseInt(barSplitString[6]))
							.setInputKind(barSplitString[7])
							.setFormatRead(barSplitString[8])
							.setSpeed(barSplitString[9])
							.build();
					if(audioPlayInfo != null) {
						audioPlayInfoList.add(audioPlayInfo);
					}else {}
				}else {}
			}else {}
		}
	}
	
	public int getAudioPlayInfoListSize() {
		return audioPlayInfoList.size();
	}
	
	public AudioPlayInfo getAudioPlayInfo(int i) {
		return audioPlayInfoList.get(i);
	}
	
	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
