package Commande;

class Fournisseur extends Personne implements Generable{


    public Fournisseur(int idFournisseur, Panneau p) {
        this.id = idFournisseur;
        this.bois = p;
    }

int getId() {
        return this.id;
}

int getPrixTot() {
        return this.bois.prix.prix*this.bois.prix.nb;
    }


}