import org.junit.jupiter.api.Test;

public class VäxtFinnsTest {
    VäxtRekord vr = new VäxtRekord();
    @Test
    void VäxtFinns() {
        vr.SkapaVäxter();
        assert (vr.VäxtFinns("Igge")==true);
        assert (vr.VäxtFinns("sfsd")==false);
        assert (vr.VäxtFinns("olof")==true);
    }
}