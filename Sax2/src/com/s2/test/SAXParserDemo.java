package com.s2.test;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserDemo {

  public static void main(String[] args) throws Exception {
    SAXParserFactory parserFactor = SAXParserFactory.newInstance();
    SAXParser parser = parserFactor.newSAXParser();
    SAXHandler handler = new SAXHandler();
    parser.parse(ClassLoader.getSystemResourceAsStream("xml/employee.xml"), 
                 handler);
    System.out.println("HI");
    //Printing the list of employees obtained from XML
    for ( Employee emp : handler.empList){
      System.out.println(emp);
    }
  }
}
