package Commande;

class Fournisseur implements Generable{
        int id_fournisseur;
        Panneau panneau;

    public Fournisseur(int id_fournisseur, Panneau p) {
        super(p);
        this.id_fournisseur = id_fournisseur;
    }

    int getId() {
        return this.id_fournisseur;
}

    int getPrixTot() {
        return this.panneau.p_panneau.prix*this.panneau.p_panneau.nb;
    }

Panneau getPanneau() {
        return this.panneau;
}
void idIncrementation(int id_fournisseur) {
        this.id_fournisseur++;
}

}