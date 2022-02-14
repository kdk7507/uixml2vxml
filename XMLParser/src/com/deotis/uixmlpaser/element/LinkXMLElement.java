package com.deotis.uixmlpaser.element;

import org.xml.sax.Attributes;

import com.deotis.uixmlpaser.visitor.UIXMLVisitor;

public class LinkXMLElement extends XMLElement {
	
	public static final String orgAttributeName = "Org";
	public static final String orgKindAttributeName = "OrgKind";
	public static final String dstAttributeName = "Dst";
	public static final String dstKindAttributeName = "DstKind";
	public static final String textAttributeName = "Text";
	public static final String tagAttributeName = "Tag";
	public static final String tooltipAttributeName = "Tooltip";
	public static final String conditionAttributeName = "Condition";
	public static final String enabledAttributeName = "Enabled";
	public static final String selectedAttributeName = "selected";
	
	public String orgAttributeValue;
	public String orgKindAttributeValue;
	public String dstAttributeValue;
	public String dstKindAttributeValue;
	public String textAttributeValue;
	public String tagAttributeValue;
	public String tooltipAttributeValue;
	public String conditionAttributeValue;
	public String enabledAttributeValue;
	public String selectedAttributeValue;
	
	public LinkXMLElement (Attributes attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
		orgAttributeValue = attributes.getValue(orgAttributeName);
		orgKindAttributeValue = attributes.getValue(orgKindAttributeName);
		dstAttributeValue = attributes.getValue(dstAttributeName);
		dstKindAttributeValue = attributes.getValue(dstKindAttributeName);
		textAttributeValue = attributes.getValue(textAttributeName);
		tagAttributeValue = attributes.getValue(tagAttributeName);
		tooltipAttributeValue = attributes.getValue(tooltipAttributeName);
		conditionAttributeValue = attributes.getValue(conditionAttributeName);
		enabledAttributeValue = attributes.getValue(enabledAttributeName);
		selectedAttributeValue = attributes.getValue(selectedAttributeName);
	}
	
	public String getOrgAttributeValue () {
		return orgAttributeValue;
	}
	
	public String getOrgKindAttributeValue () {
		return orgKindAttributeValue;
	}
	
	public String getDstAttributeValue () {
		return dstAttributeValue;
	}
	
	public String getDstKindAttributeValue () {
		return dstKindAttributeValue;
	}
	
	public String getTextAttributeValue () {
		return textAttributeValue;
	}
	
	public String getTagAttributeValue () {
		return tagAttributeValue;
	}
	
	public String getTooltipAttributeValue () {
		return tooltipAttributeValue;
	}
	
	public String getConditionAttributeValue () {
		return conditionAttributeValue;
	}
	
	public String getEnabledAttributeValue () {
		return enabledAttributeValue;
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
