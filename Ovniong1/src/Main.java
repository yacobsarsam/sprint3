import PackageBil.Bil;
import PackageBil.Bilägare;



public class Main {

    public Main() {
        Bil bil1 = new Bil("NUL919", "Toyota Aurs", 2012);
        Bil bil2 = new Bil("WJY88N", "Toyota Yaris", 2019);

        Bilägare p1 = new Bilägare("Ziyad", "Muss61", 39);
        Bilägare p2 = new Bilägare("Sarah", "Muss61", 37);
        Bilägare p3 = new Bilägare("ZiyadBasil", "Gottsunda", 40);
        Bilägare p4 = new Bilägare("SarahJajawi", "Uppsala", 38);


        Bilägare.KöpBil(bil1, p2);
        Bilägare.KöpBil(bil2, p3);
        Bilägare.SäleBil(bil2, p3);
        Bilägare.KöpBil(bil2, p2);
        Bilägare.SäleBil(bil2, p2);


        System.out.println(p2.getNamn() + " äger" + p2.getBilarReg());
Romersksiffra rs =  Romersksiffra.A;
System.out.println(rs);
    }
    public static void main(String[] args) {
        Main m1 =new Main();
    }

}