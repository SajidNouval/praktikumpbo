package Praktikum2;
//Sajid Nouval - 24060122140110

class MTitik {
    public static void main(String[] args)
    {
        Titik t1, t2, t3;
        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("T1 = " + t1.getAbsis() + ", " + t1.getOrdinat());
        System.out.println("T2 = " + t2.getAbsis() + ", " + t2.getOrdinat());
        System.out.println("T3 = " + t3.getAbsis() + ", " + t3.getOrdinat());
        System.out.println("Jumlah Objek Titik = " + Titik.getcounterTitik());
        System.out.println("Jarak T3 = " + t3.getJarakPusat());
        t1.refleksiX(t1);
        System.out.println("T1 Setelah direfleksikan X = ");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t1.refleksiY(t1);
        System.out.println("T1 Setelah direfleksikan Y = ");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t2.getRefleksiX(t2);
        System.out.println("T2 Setelah direfleksikan X = ");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        t2.getRefleksiY(t2);
        System.out.println("T2 Setelah direfleksikan Y = ");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
    }
}
