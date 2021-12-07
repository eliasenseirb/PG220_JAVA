package Commande;

        //potentiellement ajouter une conversion du mois en string avec un tab qui rassemble tout

class Date implements CheckCommande, Generable{
        int jour;
        int mois;
        int annee;

        /*
        Date(int jour, int mois, int annee)  throws CheckDate {
                if ((jour < 1) || (jour > 31) || (mois < 1) || (mois > 12))
                        throw new CheckDate(this);
                this.jour = jour;
                this.mois = mois;
                this.annee = annee;
        }
        */

        Date(int jour, int mois, int annee) {
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


        //Date d = new Date(12, 03, 15);

        //System.out.println("Nous sommes le" + d.jour + "" + d.mois + "." + d.annee);

        @Override
        public boolean isValid() {
                if(getJour() >= 1 || getJour() <= 31 && getMois() >= 1 || getMois() <= 12)
                        System.out.println("Classe Date valide");
                else if(getJour() < 1 || getJour() > 31)
                        System.out.println("Jour incorrect");
                else if(getMois() < 1 || getMois() > 12)
                        System.out.println("Mois incorrect");
                return getJour() >= 1 || getJour() <= 31 && getMois() >= 1 || getMois() <= 12;
        }
}
