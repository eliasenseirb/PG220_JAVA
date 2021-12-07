package Fichier;

/*

import Commande.Planche;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ReadXML {
    static void readXml(String filename)
    {
        try
        {
            FileInputStream file = new FileInputStream(filename);
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(file);
            while(reader.hasNext())
            {
                if(reader.next() == XMLStreamConstants.START_ELEMENT)
                {
                    if(reader.getName().toString() == "client")
                    {
                        List<String>  c = readClient(reader);
                    }
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (XMLStreamException e)
        {
            e.printStackTrace();
        }
    }
    static List<String> readClient(XMLStreamReader reader) throws XMLStreamException
    {
        int id = Integer.parseInt(reader.getAttributeValue(0));
        List<String> listPlanche = new ArrayList<>();
        while(reader.hasNext())
        {
            if(reader.next() == XMLStreamConstants.START_ELEMENT)
            {
                if(reader.getName().toString() == "planche")
                {
                    List<String> p = readPlanche(reader);
                    listPlanche.add(p);
                }

            }
        }
        List<String> Client = new ArrayList<>(id,listPlanche);
        return Client;
    }

    static List<String> readPlanche(XMLStreamReader reader) throws XMLStreamException
    {
        String idPlanche = getAttributeValue(0);
        String date = reader.getAttributeValue(2);
        //String [] split = date.split("\\.");
        //int jour = Integer.parseInt(split[0]);
        //int mois = Integer.parseInt(split[1]);
        //int annee = Integer.parseInt(split[2]);
        String prix = reader.getAttributeValue(3);
        while(reader.hasNext())
        {
            if(reader.next() == XMLStreamConstants.START_ELEMENT)
            {
                if(reader.getName().toString() == "dim")
                {
                    String longueur= reader.getAttributeValue(0);
                    String largeur = reader.getAttributeValue(1);
                }
            }
        }

        List<String> Planche = new ArrayList<>(idPlanche, date, prix, longueur, largeur);
        return Planche;
    }
}

 */