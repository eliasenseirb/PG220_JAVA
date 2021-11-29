package Commande;

class Panneau implements Generable{
        int id_panneau;
        Date d_panneau;
        Dimension dim_panneau;
        Prix p_panneau;

        public Panneau(int id_panneau, Date d, Dimension dim, Prix p) {
                this.id_panneau = id_panneau;
                this.d_panneau = d;
                this.dim_panneau = dim;
                this.p_panneau = p;
        }



        int getId() {
                return this.id_panneau;
        }

        void idIncrementation(int id_panneau) {
                this.id_panneau++;
        }

}