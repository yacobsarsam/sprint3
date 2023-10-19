import org.junit.jupiter.api.Test;

class GetVäxtTest {
    VäxtRekord vr = new VäxtRekord();
    @Test
    public void GetVäxt(){
        Växter kaktus1=  new Kaktusen( "Igge", 20);
        vr.getAllaVäxter().add(kaktus1);
        Växter palm1 = new Palmen("Laura", 5 );
        vr.getAllaVäxter().add(palm1);
        Växter köttätende1 = new Köttätande("Meatloaf", 0.7);
        vr.getAllaVäxter().add(köttätende1);
        Växter palm2 = new Palmen("Olof", 1 );
        vr.getAllaVäxter().add(palm2);
        assert (!vr.GetVäxt("meatloaf").equals(kaktus1));
        assert (vr.GetVäxt("meatloaf").equals(köttätende1));
        assert (vr.GetVäxt("Igge").equals(kaktus1));
    }
}