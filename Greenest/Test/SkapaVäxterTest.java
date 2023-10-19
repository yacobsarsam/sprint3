import org.junit.jupiter.api.Test;
class SkapaVäxterTest {
    VäxtRekord vr = new VäxtRekord();
    //testa skapa objekts och lägga till dem i arraylis
    @Test
    void skapaVäxter() {
        assert (vr.getAllaVäxter().isEmpty());
        Växter kaktus1=  new Kaktusen( "Igge", 20);
        vr.getAllaVäxter().add(kaktus1);
        assert (vr.getAllaVäxter().get(0).equals(kaktus1));
        Växter palm1 = new Palmen("Laura", 5 );
        vr.getAllaVäxter().add(palm1);
        assert (vr.getAllaVäxter().get(1).equals(palm1));
        assert (!vr.getAllaVäxter().get(0).equals(palm1));
    }
}