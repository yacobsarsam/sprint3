import org.junit.jupiter.api.Test;
import ovning1.Circle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CircleTest {
    int r= 10;


    Circle sqr= new Circle();
    @Test
    void getAreaTest(){
        System.out.println(sqr.getArea(r,r));
        assertEquals(sqr.getArea(r,r), 314.1592653589793);
         assert(sqr.getArea(r,r)!=99);
    }
    @Test
    void getCircumferenceTest(){
        System.out.println(sqr.getCircumference(r,r));
        assert(sqr.getCircumference(r,r)==62.83185307179586);
        assertNotEquals(sqr.getCircumference(r,r),100);
    }

}
