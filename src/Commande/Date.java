package Commande;

        //potentiellement ajouter une conversion du mois en string avec un tab qui rassemble tout

class Date {
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
}
