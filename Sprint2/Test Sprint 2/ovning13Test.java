import org.junit.jupiter.api.Test;
import ovning13.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class ovning13Test {

    Calculator c = new Calculator();
    @Test
    void ParseToIntTest(){
        assert(c.ParseToInt("10")==10);
        Throwable exception = assertThrows(NumberFormatException.class,() ->c.ParseToInt("aa"));
    }
    @Test
    void CalculateTest() throws OperatorNotSupportedException {
        assert(c.Calculate(8,4,"/")==2);
        Throwable exception = assertThrows(ArithmeticException.class,() ->c.Calculate(8,0,"/"));
        Throwable exception1 = assertThrows(OperatorNotSupportedException.class,() ->c.Calculate(8,0,"plus"));
    }
}