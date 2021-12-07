package Commande;

class CheckDate extends Exception {

    private Date d;

    CheckDate(Date d) {
        super("Date invalide : " + d);
        if((d.getJour() < 1) || (d.getJour() > 31))
            System.out.println("Veuillez modifier le jour dans la date");
        if((d.getMois() < 1) || (d.getMois() > 12))
            System.out.println("Veuillez modifier le mois dans la date");
        if((d.getAnnee() < 21))
            System.out.println("Veuillez modifier l'année dans la date");
        this.d = d;
    }

}