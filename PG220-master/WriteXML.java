package Fichier;


import Commande.Generable;

import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.util.ArrayList;

public class WriteXML {
    static void ecritureXML(String filename) throws Exception {

        //String ns = "lolilol";

        StringWriter strw = new StringWriter();
        XMLOutputFactory output = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = output.createXMLStreamWriter(strw);
        ArrayList<Generable> Client = new ArrayList<Generable>();
        ArrayList<Generable> Fournisseur = new ArrayList<Generable>();

        writer.writeStartDocument();
        writeDecoupe(writer, Client, Fournisseur);
        writer.writeEndDocument();
    }

    static void writeDecoupe(XMLStreamWriter writer, ArrayList<Generable> c, ArrayList<Generable> f) throws XMLStreamException {
        int nb_decoupe = 5; // a remplacer par la vraie valeur

        ArrayList

        writer.writeStartElement("decoupes");
        writer.writeStartElement("decoupe");
        for (int i = 0; i < nb_decoupe; i++) {
            writer.writeStartElement("client");
            writer.writeAttribute("id", c.id);
            writer.writeAttribute("planche", c.bois.id);
            writer.writeEndElement();

            writer.writeStartElement("fournisseur");
            writer.writeAttribute("id", f.id);
            writer.writeAttribute("panneau", f.bois.id);
            writer.writeEndElement();
        }
        writer.writeEndElement();
        writer.writeEndElement();

    }
}
