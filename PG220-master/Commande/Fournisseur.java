package Commande;

import java.util.ArrayList;

class Fournisseur extends Personne implements Generable{


    Fournisseur(int idFournisseur, ArrayList<TypeBois> p) {
        super(idFournisseur, p);
    }

int getId() {
        return this.id;
}


}