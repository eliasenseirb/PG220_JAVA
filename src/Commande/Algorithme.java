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

        if(c.planche.dim_planche.longueur + min < f.panneau.dim_panneau.longueur &&
           c.planche.dim_planche.largeur + max < f.panneau.dim_panneau.largeur &&
           c.planche.d_planche.annee >= f.panneau.d_panneau.annee &&
           c.planche.d_planche.mois >= f.panneau.d_panneau.mois &&
           c.planche.d_planche.jour >= f.panneau.d_panneau.jour &&
           c.planche.p_planche.prix >= f.panneau.p_panneau.prix*f.panneau.p_panneau.nb) {
                //read decoupe.xml et faire les bonnes decoupe
                //decouper comme on peut jusqu'au maximum sinon


        }
}

}


