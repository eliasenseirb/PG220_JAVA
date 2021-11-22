package Fichier;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class LectureXML2 {
    static void sendData() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("clients.xml");
            Element client = document.getDocumentElement();
            NodeList clients = client.getElementsByTagName("client");
            Element [] dates;
            int size = ((Element) clients.item(0)).getElementsByTagName("planche").getLength();
            for (int i = 0; i < size; i++) {
                dates[i] = ((Element) clients.item(0)).getElementsByTagName("planche").item(0).getAttributes().getNamedItem("date").getNodeValue();

            }
            System.out.println(((Element) clients.item(0)).getElementsByTagName("planche").item(0).getAttributes().getNamedItem("date").getNodeValue());
            //System.out.println(clients.item(1).getAttributes().getNamedItem("id").getNodeValue());
        } catch (Exception e) {

        }
    }
}
