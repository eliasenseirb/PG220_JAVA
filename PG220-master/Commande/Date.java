package Commande;

        //potentiellement ajouter une conversion du mois en string avec un tab qui rassemble tout

class Date extends Infos implements CheckCommande{
        int jour;
        int mois;
        int annee;

        Date(int jour, int mois, int annee)  throws CheckDate {
                if ((jour < 1) || (jour > 31) || (mois < 1) || (mois > 12))
                        throw new CheckDate(this);
                this.jour = jour;
                this.mois = mois;
                this.annee = annee;
        }

        int getJour() {
                return this.jour;
        }

        int getMois() {
                return this.mois;
        }

        int getAnnee() {
                return this.annee;
        }

        void setJour(int jour) {
                this.jour = jour;
        }

        void setMois(int mois) {
                this.mois = mois;
        }

        void setAnnee(int annee) {
                this.annee = annee;
        }

        //Date d = new Date(12, 03, 15);

        //System.out.println("Nous sommes le" + d.jour + "" + d.mois + "." + d.annee);

        @Override
        public boolean isValid() {
                return d.getJour() >= 1 || d.getJour() <= 31 && d.getMois() >= 1 || d.getMois() <= 12;
        }
}
