package Commande;

class Client implements Generable{
        int idClient;
        Planche planche;

        Client(int idClient, Planche p) {
                this.idClient = idClient;
                this.planche = p;
        }



int getId() {
        return this.idClient;
}

int getPrixUnitaire() {
                return this.planche.dataPlanche.p.prix/this.planche.dataPlanche.p.nb;
        }

Planche GetPlanche() {
        return this.planche;
}


}
