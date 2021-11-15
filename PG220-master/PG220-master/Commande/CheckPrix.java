package Commande;

class CheckPrix extends Exception {

    private Prix p;

    CheckPrix(Prix p) {
        super("Prix invalide, veuillez mettre une valeur positive ");
        this.p = p;
    }

    boolean isValid() {
        return p.getPrix() >= 1;
    }

}