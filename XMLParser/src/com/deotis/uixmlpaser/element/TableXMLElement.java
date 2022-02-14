package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class TableXMLElement extends XMLElement {
	
	public static final String keyAttributeName = "key";
	public static final String tabletextAttributeName = "tabletext";
	public static final String tablekindAttributeName = "tablekind";
	public static final String textAttributeName = "text";
	public static final String intxAttributeName = "intx";
	public static final String cxAttributeName = "cx";
	public static final String cyAttributeName = "cy";
	public static final String tagAttributeName = "tag";
	public static final String memoAttributeName = "memo";
	public static final String prevAttributeName = "prev";
	public static final String selectedAttributeName = "selected";
	
	private String keyAttributeValue;
	private String tabletextAttributeValue;
	private String tablekindAttributeValue;
	private String textAttributeValue;
	private String intxAttributeValue;
	private String cxAttributeValue;
	private String cyAttributeValue;
	private String tagAttributeValue;
	private String memoAttributeValue;
	private String prevAttributeValue;
	private String selectedAttributeValue;
	
	public TableXMLElement (Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		keyAttributeValue = attributes.getValue(keyAttributeName);
		tabletextAttributeValue = attributes.getValue(tabletextAttributeName);
		tablekindAttributeValue = attributes.getValue(tablekindAttributeName);
		textAttributeValue = attributes.getValue(textAttributeName);
		intxAttributeValue = attributes.getValue(intxAttributeName);
		cxAttributeValue = attributes.getValue(cxAttributeName);
		cyAttributeValue = attributes.getValue(cyAttributeName);
		tagAttributeValue = attributes.getValue(tagAttributeName);
		memoAttributeValue = attributes.getValue(memoAttributeName);
		prevAttributeValue = attributes.getValue(prevAttributeName);
		selectedAttributeValue = attributes.getValue(selectedAttributeName);
	}
	
	public String getKeyAttributeValue () {
		return keyAttributeValue;
	}
	
	public String getTabletextAttributeValue () {
		return tabletextAttributeValue;
	}
	
	public String getTablekindAttributeValue () {
		return tablekindAttributeValue;
	}
	
	public String getTextAttributeValue () {
		return textAttributeValue;
	}
	
	public String getIntxAttributeValue () {
		return intxAttributeValue;
	}
	
	public String getCxAttributeValue () {
		return cxAttributeValue;
	}
	
	public String getCyAttributeValue () {
		return cyAttributeValue;
	}
	
	public String getTagAttributeValue () {
		return tagAttributeValue;
	}
	
	public String getMemoAttributeValue () {
		return memoAttributeValue;
	}
	
	public String getPrevAttributeValue () {
		return prevAttributeValue;
	}
	
	public String getSelectedAttributeValue () {
		return selectedAttributeValue;
	}

	@Override
	public void accept(UIXMLVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
