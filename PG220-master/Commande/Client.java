package Commande;

class Client extends Planche {
        int id_client;
        Planche planche;

int getId() {
        return this.id_client;
}

Planche GetPlanche() {
        return this.planche;
}
void idIncrementation(int id_client) {
        this.id_client++;
}

}