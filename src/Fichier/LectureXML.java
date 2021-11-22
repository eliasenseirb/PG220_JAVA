package Fichier;

import Commande.Planche;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LectureXML {
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
                        Client c = readClient(reader);
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
    static Client readClient(XMLStreamReader reader) throws XMLStreamException
    {
        int id = Integer.parseInt(reader.getAttributeValue(0));
        List<Commande.CommandeFactory.generatePlanche(idPlanche,date,dime,prix)> listPlanche = new ArrayList<>();
        while(reader.hasNext())
        {
            if(reader.next() == XMLStreamConstants.START_ELEMENT)
            {
                if(reader.getName().toString() == "planche")
                {
                    Planche p = readPlanche(reader);
                    listPlanche.add(p);
                }

            }
        }
        return new Client(id,listPlanche);
    }

    static Planche readPlanche(XMLStreamReader reader) throws XMLStreamException
        {
        int idPlanche = Integer.parseInt(getAttributeValue(0));
        String date = reader.getAttributeValue(2);
        String [] split = date.split("\\.");
        int jour = Integer.parseInt(split[0]);
        int mois = Integer.parseInt(split[1]);
        int annee = Integer.parseInt(split[2]);
        int prix = Integer.parseInt(reader.getAttributeValue(3));
        while(reader.hasNext())
        {
            if(reader.next() == XMLStreamConstants.START_ELEMENT)
            {
                if(reader.getName().toString() == "dim")
                {
                    int longueur= Integer.parseInt(reader.getAttributeValue(0));
                    int largeur = Integer.parseInt(reader.getAttributeValue(1));
                }
            }
        }
        
        ClientFactory.generateDimension(longueur,largeur);
        return new Planche(idPlanche,date,prix,dim);
    }
}
