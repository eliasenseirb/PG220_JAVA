package Commande;

class Client extends Personne implements Generable{

        Client(int idClient, Planche p) {
                this.id = idClient;
                this.bois = p;
        }



int getId() {
        return this.id;
}

int getPrixUnitaire() {
                return this.bois.prix.prix/this.bois.prix.nb;
        }



}
