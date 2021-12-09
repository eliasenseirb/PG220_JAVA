package Commande;

class Algorithme {
        int idAlgo;
        int xCut;
        int yCut;


        int getId(int idAlgo) {
                return this.idAlgo;
        }
        int getxCut(int xCut) {
                return this.xCut;
        }
        int getyCut(int yCut) {
                return this.yCut;
        }


void algo1(Client c, Fournisseur f, int xCut, int yCut) {
        int min = xCut;
        int max = yCut;
        if(yCut < xCut) {
                max = min;
                min = yCut;
        }
        /*
        if(c.bois.dim.longueur + min < f.bois.dim.longueur &&
           c.bois.dim.largeur + max < f.bois.dim.largeur &&
           c.bois.date.annee >= f.bois.date.annee &&
           c.bois.date.mois >= f.bois.date.mois &&
           c.bois.date.jour >= f.bois.date.jour &&
           c.bois.prix.prix >= f.bois.prix.prix*f.bois.prix.nb) {
                //read decoupe.xml et faire les bonnes decoupe
                //decouper comme on peut jusqu'au maximum sinon


        }
        */
}

}


