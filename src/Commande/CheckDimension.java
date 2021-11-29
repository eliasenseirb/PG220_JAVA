package Commande;

class CheckDimension extends Exception {

    private Dimension dim;

    CheckDimension(Dimension dim) {
        super("Dimensions invalide : " + dim);
        if((dim.getLongueur() < 1))
            System.out.println("Veuillez modifier la longueur dans la dimension");
        if((dim.getLargeur() < 1))
            System.out.println("Veuillez modifier la largeur dans la dimension");
        this.dim = dim;
    }

    boolean isValid() {
        return dim.getLongueur() >= 1 && dim.getLargeur() >= 1;
    }

}