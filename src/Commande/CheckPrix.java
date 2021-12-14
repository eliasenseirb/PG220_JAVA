package Commande;

class CheckPrix extends Exception {

    private Prix p;

    CheckPrix(Prix p) {
        super("Prix invalide : " + p);
        if((p.getPrice() < 0))
            System.out.println("Veuillez modifier le prix dans la classe Prix");
        if((p.getNb() < 1))
            System.out.println("Veuillez modifier le nombre de planches/panneaux dans la classe Prix");
        this.p = p;
    }

}