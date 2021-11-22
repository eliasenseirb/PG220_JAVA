package Commande;

    class Main {
        Date d;

        public static void main(String[] args) {
            Date d = new Date(12, 03, 15);

            System.out.println("Nous sommes le" + d.jour + "" + d.mois + "." + d.annee);
        }
    }

//class Main {
//    public static void main(String[] args) {
//        Date d = new Date(12, 03, 15);
//
//        System.out.println("Nous sommes le" + jour + "." + mois + "." + annee);
//    }
//}
