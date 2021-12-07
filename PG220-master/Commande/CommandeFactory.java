package Commande;

public class CommandeFactory implements Generable{

    Date generateDate(int jour, int mois, int annee) throws CheckDate {
        return new Date(jour, mois, annee);
    }

    Dimension generateDimension(int longueur, int largeur) throws CheckDimension {
        return new Dimension(longueur, largeur);
    }

    Prix generatePrix(int prix, int nombre) throws CheckPrix {
        return new Prix(prix, nombre);
    }

    Planche generatePlanche(int idPlanche, Date d, Prix p, Dimension dim) {
        return new Planche(idPlanche, d, p, dim);
    }

    Panneau generatePanneau(int idPanneau, Date d, Prix p, Dimension dim) {
        return new Panneau(idPanneau, d, p, dim);
    }

    Client generateClient(int idClient, Planche p) {
        return new Client(idClient, p);
    }

    Fournisseur generateFournisseur(int idFournisseur, Panneau p) {
        return new Fournisseur(idFournisseur, p);
    }
}

