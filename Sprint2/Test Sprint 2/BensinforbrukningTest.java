import ovning4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BensinforbrukningTest {
    @Test
    void CalculateMilInYearTest(){
        Mil m = new Mil();
        assertEquals(m.GetNumberOfMilInYear(2500, 1500),1000);


    }
    @Test
    void CalculateConcumptionPerMilTest() {
        Concumption c = new Concumption();
        assertEquals(c.CalculateConcumptionPerMil(30, 60),0.5);
    }
}
