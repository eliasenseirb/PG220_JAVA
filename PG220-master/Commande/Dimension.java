package Commande;

class Dimension implements CheckCommande, Generable {
        //les tailles d'une planche ou d'un panneau
        int longueur;
        int largeur;

        public Dimension(int longueur,int largeur) {

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
        @Override
        public boolean isValid() {
                if(getLongueur() >= 1 && getLargeur() >= 1)
                        System.out.println("Classe Dimension valide");
                else if (getLongueur() < 1)
                        System.out.println("Longueur incorrecte");
                else if (getLargeur() < 1)
                        System.out.println("Largeur incorrecte");
                return getLongueur() >= 1 && getLargeur() >= 1;
        }
}