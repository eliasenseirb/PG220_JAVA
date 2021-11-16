package Commande;

class Fournisseur extends Panneau {
        int id_fournisseur;
        Panneau panneau;

int getId() {
        return this.id_fournisseur;
}

Panneau getPanneau() {
        return this.panneau;
}
void idIncrementation(int id_fournisseur) {
        this.id_fournisseur++;
}

}