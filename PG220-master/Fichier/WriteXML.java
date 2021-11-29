package Fichier;

import Commande.Client;
import Commande.Planche;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class WriteXML {
    static void ecritureXML(String filename) throws Exception {

        String ns = "lolilol";
        StringWriter strw = new StringWriter();
        XMLOutputFactory output = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = output.createXMLStreamWriter(strw);
        writer.writeStartDocument();
        writeClient(writer, Client c);
        writer.writeEndDocument();
    }

    static void writeClient(XMLStreamWriter writer, Commande.Client c) throws XMLStreamException {
        int nb_client = 5; // remplacer par id_max du client
        int nb_planche = 5; // remplacer par id_max de la planche pour le client i
        //potentiellement utiliser un tableau de clients dans lequel il y a tt les planches pour le client i
        writer.writeStartElement("clients");
        for (int j = 0; j < nb_client; j++) {
            writer.writeStartElement("client");
            writer.writeAttribute("id", c.id_client);
            for (int i = 0; i < nb_planche; i++) {
                writer.writeStartElement("planche");
                writer.writeAttribute("id", c.planche.id_planche);
                writer.writeAttribute("nombre", c.planche.p_planche.nb);
                writer.writeAttribute("date", c.planche.d_planche);
                writer.writeAttribute("prix", c.planche.p_planche.prix);
                writer.writeStartElement("dim");
                writer.writeAttribute("L", c.planche.dim_planche.longueur);
                writer.writeAttribute("l", c.planche.dim_planche.largeur);
                writer.writeEndElement();
                writer.writeEndElement();

            }
        }
        writer.writeEndElement();
        writer.writeEndElement();

    }
}