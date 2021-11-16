package Commande;

class Dimension extends Infos implements CheckCommande {
        //les tailles d'une planche ou d'un panneau
        private int longueur;
        private int largeur;

        public Dimension(int longueur,int largeur) throws CheckDimension {
                if ((longueur < 1) || (largeur < 1))
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

        void setLongueur(int longueur) {
                this.longueur = longueur;
        }

        void setLargeur(int largeur) {
                this.largeur = largeur;
        }

        @Override
        public boolean isValid() {
                return dim.getLongueur() >= 1 && dim.getLargeur() >= 1;
        }
}