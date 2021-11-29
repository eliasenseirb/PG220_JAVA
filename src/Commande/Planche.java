package Commande;
class Planche implements Generable{
        int id_planche;
        Date d_planche;
        Dimension dim_planche;
        Prix p_planche;

        Planche(int id_planche, Date d, Dimension dim, Prix p) {
                this.id_planche = id_planche;
                this.d_planche = d;
                this.dim_planche = dim;
                this.p_planche = p;
        }


        int getId() {
                return this.id_planche;
        }

        void idIncrementation(int id_planche) {
                this.id_planche++;
        }

}
