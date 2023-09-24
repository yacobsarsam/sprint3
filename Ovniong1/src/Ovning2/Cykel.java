package Ovning2;

public class Cykel extends Fordon implements Printable {
    int antalVäxlar, växelJustNu;

    public Cykel(int antalVäxlar,int hastighet, int vikt) {
        super(vikt, hastighet);
        this.antalVäxlar = antalVäxlar;
    }

    @Override
    public void printMe() {
        System.out.println("Cykelvikt: " + vikt + " har hastighet " + hastighet
                + " med antal växel "  + antalVäxlar);
    }

    public void växla (int växel, int vikt){
        this.växelJustNu=växel;
    }

}
