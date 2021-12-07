package Commande;

public class CommandeFactory implements Generable{

    Date generateDate(int jour, int mois, int annee) {
        return new Date(jour, mois, annee);
    }

    Dimension generateDimension(int longueur, int largeur) {
        return new Dimension(longueur, largeur);
    }

    Prix generatePrix(int prix, int nombre) {
        return new Prix(prix, nombre);
    }

    Planche generatePlanche(int idPlanche, Infos dataPlanche) {
        return new Planche(idPlanche, dataPlanche);
    }

    Panneau generatePanneau(int idPanneau, Infos dataPanneau) {
        return new Panneau(idPanneau, dataPanneau);
    }

    Client generateClient(int idClient, Planche p) {
        return new Client(idClient, p);
    }

    Fournisseur generateFournisseur(int idFournisseur, Panneau p) {
        return new Fournisseur(idFournisseur, p);
    }
}

