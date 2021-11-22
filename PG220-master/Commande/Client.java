package Commande;

class Client implements Generable{
        int id_client;
        Planche planche;

        Client(int id_client, Planche p) {
                super(p);
                this.id_client = id_client;
        }



        int getId() {
        return this.id_client;
}

        int getPrixUnitaire() {
                return this.planche.p_planche.prix/this.planche.p_planche.nb;
        }

Planche GetPlanche() {
        return this.planche;
}

void idIncrementation(int id_client) {
        this.id_client++;
}

}
