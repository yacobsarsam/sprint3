package ovning11;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class ovning11 {

    Input i = new Input();

    int bandlängd = 300;
    int användBand = 100;
    LocalTime progStart = LocalTime.of(10,00,00);
    LocalTime progSlut = LocalTime.of(11,30,00);
    @Test
    void CalculateDurationInMiuntesTest(){
        System.out.println(i.CalculateDurationInMiuntes(progStart,progSlut));
        assert (i.CalculateDurationInMiuntes(progStart,progSlut) == 90);
    }
    @Test
    void CalculateTidDurationTest(){

        assert (i.CalculateTidDurationIn(bandlängd,användBand) == 200);
    }
    @Test
    void IsGetPlaceTest (){
        assert (i.IsGetPlace (200,90));
        assert (i.IsGetPlace (i.CalculateTidDurationIn(bandlängd,användBand),
                i.CalculateDurationInMiuntes(progStart,progSlut)));
        assert (!i.IsGetPlace (i.CalculateDurationInMiuntes(progStart,progSlut),i.CalculateTidDurationIn(bandlängd,användBand)));
    }
    @Test
    void DoProgramTest(){
        boolean isTest = true;
        assert (i.DoProgram(isTest,500,300,"10:00","12:30"));
    System.out.println("test reslutat is : " + i.DoProgram(isTest,500,300,"10:00","12:30"));
    }
}
