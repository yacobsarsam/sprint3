import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeräknaVätskaTest {

    VäxtRekord vr = new VäxtRekord();

    @Test
    void BeräknaVätska() {
        vr.SkapaVäxter();
        //Växter kaktus1 = new Kaktusen("Igge", 20);
        assert (vr.GetVäxt("Igge").BeräknaVätska() != 0.5);
        Assertions.assertEquals(vr.GetVäxt("Igge").BeräknaVätska(), 0.02);

        Assertions.assertEquals(vr.GetVäxt("olof").BeräknaVätska(), 0.5);
        Assertions.assertNotEquals(vr.GetVäxt("olof").BeräknaVätska(), 1);

        Assertions.assertEquals(vr.GetVäxt("Meatloaf").BeräknaVätska(), 0.24);
        Assertions.assertNotEquals(vr.GetVäxt("Meatloaf").BeräknaVätska(), 0.2);
    }
}