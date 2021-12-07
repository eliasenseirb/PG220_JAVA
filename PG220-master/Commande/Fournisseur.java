package Commande;

class Fournisseur implements Generable{
        int idFournisseur;
        Panneau panneau;

    public Fournisseur(int idFournisseur, Panneau p) {
        this.idFournisseur = idFournisseur;
        this.panneau = p;
    }

int getId() {
        return this.idFournisseur;
}

int getPrixTot() {
        return this.panneau.dataPanneau.p.prix*this.panneau.dataPanneau.p.nb;
    }

Panneau getPanneau() {
        return this.panneau;
}

}