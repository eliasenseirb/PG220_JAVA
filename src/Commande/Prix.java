package Commande;

class Prix extends Infos implements CheckCommande, Generable{
    int prix;
    int nb;

    Prix(int prix_unitaire, int nombre) {
        this.prix = prix_unitaire;
        this.nb = nombre;
    }

    int getPrix() {
        return this.prix;
    }

    int getNb() {
        return this.nb;
    }

    void setPrix(int prix) {
        this.prix = prix;
    }

    void setNb(int nb) {
        this.nb = nb;
    }

    @Override
    public boolean isValid() {
        return p.getPrixUnit() >= 1 || p.getNb() >= 1;
    }
}