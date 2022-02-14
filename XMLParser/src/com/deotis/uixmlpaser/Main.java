package com.deotis.uixmlpaser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.deotis.uixmlpaser.element.XMLElement;
import com.deotis.uixmlpaser.saxhandler.UIXMLHandler;
import com.deotis.uixmlpaser.visitor.UIXML2VXMLVisitor;
import com.deotis.vxml.struct.VXMLStruct;
import com.deotis.vxml.visitor.VXMLPrintVisitor;
import com.deotis.vxml.visitor.VXMLStructVisitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello XML Parser!!");
		
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
//		File xmlFile = new File("data/1-51.xml");
		File xmlFile = new File("data/ex.xml");
		
		try {
			SAXParser parser = parserFactory.newSAXParser();
			UIXMLHandler handler = new UIXMLHandler();
			parser.parse(xmlFile, handler);
			XMLElement rootElement = handler.getRootElement();
//			UIXMLVisitor visitor = new UIXMLPrintVisitor();
			UIXML2VXMLVisitor visitor = new UIXML2VXMLVisitor();
			rootElement.accept(visitor);
			VXMLStruct vxmlStruct = visitor.getVXMLStruct();
			VXMLStructVisitor vxmlVisitor = new VXMLPrintVisitor(System.out);
			vxmlStruct.accept(vxmlVisitor);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
