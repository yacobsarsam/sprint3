package PackageBil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilägareTest {

    Bil bil1 = new Bil("NUL919", "Toyota Aurs", 2012);
    Bil bil2 = new Bil("WJY88N", "Toyota Yaris", 2019);

    Bilägare p1 = new Bilägare("Ziyad", "Muss61", 39);
    Bilägare p2 = new Bilägare("Sarah", "Muss61", 37);
    Bilägare p3 = new Bilägare("Leo", "Gottsunda", 20);
    @Test
    void köpBil() {
        Bilägare.KöpBil(bil1, p1);
        assert (p1.getNamn()==bil1.getÄgare().getNamn());
        assert (p2.getNamn()!=bil1.getÄgare().getNamn());
        Bilägare.KöpBil(bil2, p2);
        assert (p2.getNamn()==bil2.getÄgare().getNamn());
        assert (p2.getNamn()!=bil1.getÄgare().getNamn());
        Bilägare.SäleBil(bil1, p1);
        Bilägare.KöpBil(bil1, p3);
        assert (p3.getNamn()==bil1.getÄgare().getNamn());
        assert (p1.getNamn()!=bil1.getÄgare().getNamn());
        assert (!p1.getBilarReg().contains(bil1.getRegistreringsnummer()));

    }

    @Test
    void säleBil() {
    }

    @Test
    void getBilarReg() {
    }
}