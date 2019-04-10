package com.service.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ValidateXML {

	public Map<String,String> parseXmlData(String xml) throws ParserConfigurationException, SAXException, IOException{
		Map<String,String> output = new HashMap<String, String>();
		InputStream is = new ByteArrayInputStream(xml.getBytes());
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    dbf.setNamespaceAware(true);
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    Document document = db.parse(is,"UTF-8");	    
	    
	    Element eElement = document.getDocumentElement();
	    System.out.println(" attribute name "+ eElement.getAttribute("object_name"));
	    output.put("object_name", eElement.getAttribute("object_name"));
	    
	    return output;
	}

}
