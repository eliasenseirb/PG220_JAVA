package Commande;

import java.util.ArrayList;

class Client extends Personne implements Generable{

        Client(int idClient, ArrayList<TypeBois> p) {
                super(idClient, p);
        }



int getId() {
        return this.id;
}

// int getPrixUnitaire() {
//                return this.bois.prix.prix/this.bois.prix.nb;
//        }



}
