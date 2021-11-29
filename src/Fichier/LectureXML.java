package Fichier;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LectureXML {
    static void readXml(String filename) {
        try {
            FileInputStream file = new FileInputStream(filename);
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(file);
            while (reader.hasNext()) {
                if (reader.next() == XMLStreamConstants.START_ELEMENT) {
                    if (reader.getName().toString() == "client") {
                        List<List<List<String>>> c = readClient(reader);
                    }
                    if(reader.getName().toString( )== "fournisseur"){
                        List<List<List<String>>> f = readFournisseur(reader);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    static List<List<List<String>>> readClient(XMLStreamReader reader) throws XMLStreamException {
        int id = Integer.parseInt(reader.getAttributeValue(0));
        List<List<String>> listPlanche = new ArrayList<>();
        while (reader.hasNext()) {
            if (reader.next() == XMLStreamConstants.START_ELEMENT) {
                if (reader.getName().toString() == "planche") {
                    List<String> p = readBois(reader);
                    listPlanche.add(p);
                }

            }
        }
        List<List<List<String>>> Client = new ArrayList<>(id, listPlanche);
        return Client;
    }

    static List<List<List<String>>> readFournisseur(XMLStreamReader reader) throws XMLStreamException {
        int id = Integer.parseInt(reader.getAttributeValue(0));
        List<List<String>> listPanneau = new ArrayList<>();
        while (reader.hasNext()) {
            if (reader.next() == XMLStreamConstants.START_ELEMENT) {
                if (reader.getName().toString() == "panneau") {
                    List<String> pan = readBois(reader);
                    listPanneau.add(pan);
                }

            }
        }
        List<List<List<String>>> Client = new ArrayList<>(id, listPanneau);
        return Client;
    }

    static List<String> readBois(XMLStreamReader reader) throws XMLStreamException {
        String idBois = reader.getAttributeValue(0);
        String nombre = reader.getAttributeValue(1);
        String date = reader.getAttributeValue(2);
        String[] split = date.split("\\.");
        String jour = split[0];
        String mois = split[1];
        String annee = split[2];
        String prix = reader.getAttributeValue(3);

        while (reader.hasNext()) {
            if (reader.next() == XMLStreamConstants.START_ELEMENT) {
                if (reader.getName().toString() == "dim") {
                    String longueur = reader.getAttributeValue(0);
                    String largeur = reader.getAttributeValue(1);
                }
            }
        }
        List<String> Bois= new ArrayList<>(idBois, nombre, jour, mois, annee, prix, longueur, largeur);
        return Bois;
    }
}

