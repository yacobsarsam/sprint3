package ovning11;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class Input {
    public Input() {
        ReadInput();
    }
    void ReadInput() {
    }

    public int CalculateDurationInMiuntes(LocalTime progStart, LocalTime progSlut) {
        return (int) Duration.between(progStart, progSlut).toMinutes();
    }

    public int CalculateTidDurationIn(int totBandLängd, int användBandLängd) {
        return totBandLängd - användBandLängd;
    }

    public static void main(String[] args) {
        boolean isTest = false;
        Input i = new Input();
        i.DoProgram(false, -1, -1, "-1", "-1");
    }

    public boolean IsGetPlace(int available, long vidioLong) {
        return (available >= vidioLong);
    }

    public boolean DoProgram(boolean isTest, int vidioBandLängdT, int användDelBandT, String progTidStartT, String progTidSlutT) {
        if (isTest) {
            return IsGetPlace(CalculateTidDurationIn(vidioBandLängdT, användDelBandT)
                    , CalculateDurationInMiuntes(LocalTime.parse(progTidStartT), LocalTime.parse(progTidSlutT)));
        } else {
            int vidioBandLängd, användDelBand; // i min
            String progTidStart, progTidSlut; //mm:ss
            Scanner s = new Scanner(System.in);
            System.out.println("vidioBandLängd in min?");
            vidioBandLängd = s.nextInt();
            s.nextLine();
            System.out.println("användDelBand in min?");
            användDelBand = s.nextInt();
            s.nextLine();
            System.out.println("progTidStart as mm:ss ?");
            progTidStart = s.nextLine();
            System.out.println("progTidSlut as mm:ss ?");
            progTidSlut = s.nextLine();
            System.out.println(IsGetPlace(CalculateTidDurationIn(vidioBandLängd, användDelBand)
                    , CalculateDurationInMiuntes(LocalTime.parse(progTidStart), LocalTime.parse(progTidSlut))));
            return false;
        }
    }
}