//Sajid Nouval - 24060122140110

package Main;
import bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(6, 9, 3);
        segitiga.printInfoSegitiga();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuasSegitiga());
    }
}