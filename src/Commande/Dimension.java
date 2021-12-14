package Commande;

class Dimension implements CheckCommande, Generable {
        //les tailles d'une planche ou d'un panneau
        int longueur;
        int largeur;

        public Dimension(int longueur,int largeur) throws CheckDimension {
                if ((largeur < 1) || (longueur < 1) || (largeur > longueur))
                        throw new CheckDimension(this);
                this.largeur = largeur;
                this.longueur = longueur;
        }

        int getLongueur() {
                return this.longueur;
        }

        int getLargeur() {
                return this.largeur;
        }



        // verifier aussi si c'est un nombre entier et pas un string
        public boolean isValid() {
                if(getLongueur() >= 1 && getLargeur() >= 1)
                        System.out.println("Classe Dimension valide");
                else if (getLongueur() < 1)
                        System.out.println("Longueur incorrecte");
                else if (getLargeur() < 1)
                        System.out.println("Largeur incorrecte");
                else if (getLargeur() > getLongueur())
                    System.out.println("La largeur ne peut pas être plus grande que la longueur");
                return getLongueur() >= 1 && getLargeur() >= 1;
        }
}