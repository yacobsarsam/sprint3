import org.junit.jupiter.api.Test;
import ovning1.Square;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    int l= 10;
    int w = 10;

            Square sqr= new Square();
    @Test
    void getAreaTest(){
        assertEquals(sqr.getArea(l, w), 100);
        assert(sqr.getArea(l,w)==100);
        assert(sqr.getArea(l,w)!=99);
    }
    @Test
    void getCircumferenceTest(){
        assert(sqr.getCircumference(l,w)==40);
        assertNotEquals(sqr.getCircumference(l,w),100);
    }

}
