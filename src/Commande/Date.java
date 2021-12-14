package Commande;

class Date implements CheckCommande, Generable{
        int jour;
        int mois;
        int annee;


        Date(int jour, int mois, int annee)  throws CheckDate {
                if ((jour < 1) || (jour > 31) || (mois < 1) || (mois > 12) || (annee <= 21))
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


        public boolean isValid() {
                if(getJour() >= 1 || getJour() <= 31 && getMois() >= 1 || getMois() <= 12)
                        System.out.println("Classe Date valide");
                if(getJour() < 1 || getJour() > 31)
                        System.out.println("Jour incorrect");
                if(getMois() < 1 || getMois() > 12)
                        System.out.println("Mois incorrect");
                if(getAnnee() < 21)
                        System.out.println("Année incorrect");
                return getJour() >= 1 || getJour() <= 31 && getMois() >= 1 || getMois() <= 12;
        }
}
