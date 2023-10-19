import org.junit.jupiter.api.Test;
import ovning1.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TriangleTest {
    int h= 100;
    int b = 100;

    Triangle sqr= new Triangle();
    @Test
    void getAreaTest(){
        assertEquals(sqr.getArea(h, b), 5000);

        assert(sqr.getArea(h,b)!=222);
    }
    @Test
    void getCircumferenceTest(){
        System.out.println(Math.round(b+ 2*(Math.sqrt(Math.pow(h,2)+Math.pow(b,2)/4))));
        assert(sqr.getCircumference(h,b)==323.60679774997897);
        assertNotEquals(sqr.getCircumference(h,b),100);
    }
}
