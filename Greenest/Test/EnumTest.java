import org.junit.jupiter.api.Test;

public class EnumTest {
    @Test
    void EnumVätskaSortTest() {
        assert (VätskaSort.MINERALVATTEN.toString().equals("MINERALVATTEN"));
        assert (!VätskaSort.MINERALVATTEN.toString().equals("KRANVATTEN"));
    }

}
