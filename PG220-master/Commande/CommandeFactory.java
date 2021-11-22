package Commande;

public class CommandeFactory implements Generable{

    Date generateDate(int jour, int mois, int annee) {
        return new Date(jour, mois, annee);
    }

    Dimension generateDimension(int longueur, int largeur) {
        return new Dimension(longueur, largeur);
    }

    Prix generatePrix(int prix_unitaire, int nombre) {
        return new Prix(prix_unitaire, nombre);
    }

    Planche generatePlanche(int id_planche, Date d, Dimension dim, Prix p) {
        return new Planche(id_planche, d, dim, p);
    }

    Panneau generatePanneau(int id_panneau, Date d, Dimension dim, Prix p) {
        return new Panneau(id_panneau, d, dim, p);
    }

    Client generateClient(int id_client, Planche p) {
        return new Client(id_client, p);
    }

    Fournisseur generateFournisseur(int id_fournisseur, Panneau p) {
        return new Fournisseur(id_fournisseur, p);
    }
}

