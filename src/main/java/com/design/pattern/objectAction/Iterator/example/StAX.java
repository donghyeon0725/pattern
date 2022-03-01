package com.design.pattern.objectAction.Iterator.example;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * StAX => Streaming API for XML
 *          * 읽거나 만들 때 사용할 수 있는 라이브러리 (콘솔 기반 API, 이터레이터 기반 API)
 * SAX => Simple API for XML (서로 다른 것)
 *          * 읽을 때만 사용 가능한 라이브러리
 * */
public class StAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("Book.xml"));

        while (reader.hasNext()) {
            XMLEvent event = reader.nextEvent();
            System.out.println(event);

            if (event.isStartElement()) {
                StartElement startElement = event.asStartElement();
                QName name = startElement.getName();
                if (name.getLocalPart().equals("book")) {
                    Attribute title = startElement.getAttributeByName(new QName("title"));
                    System.out.println("title : "  + title.getValue());
                }
            }
        }

    }
}
