package Commande;

abstract class Infos {
        Date d;
        Dimension dim;
        Prix p;



Date getDate() {
        return d;
}

Dimension getDimension() {
        return dim;
}

Prix getPrix() {
        return p;
}
}