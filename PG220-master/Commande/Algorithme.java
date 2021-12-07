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

        if(c.planche.dataPlanche.dim.longueur + min < f.panneau.dataPanneau.dim.longueur &&
           c.planche.dataPlanche.dim.largeur + max < f.panneau.dataPanneau.dim.largeur &&
           c.planche.dataPlanche.d.annee >= f.panneau.dataPanneau.d.annee &&
           c.planche.dataPlanche.d.mois >= f.panneau.dataPanneau.d.mois &&
           c.planche.dataPlanche.d.jour >= f.panneau.dataPanneau.d.jour &&
           c.planche.dataPlanche.p.prix >= f.panneau.dataPanneau.p.prix*f.panneau.dataPanneau.p.nb) {
                //read decoupe.xml et faire les bonnes decoupe
                //decouper comme on peut jusqu'au maximum sinon


        }
}

}


