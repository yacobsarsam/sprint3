package ovning10;

import javax.security.sasl.SaslServer;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tid {
    public Tid (){
        String stad;
        ZoneId zi;
        Scanner ss = new Scanner(System.in);
        System.out.println("Time zone? ");
        stad = ss.nextLine().trim().toLowerCase();
        switch (stad){
            case "stockholm":
                zi = ZoneId.of("CET");
                break;
            case "toronto":
                 zi = ZoneId.of("America/Toronto");
                break;

            case "shanghai":
                 zi = ZoneId.of("Asia/Shanghai");
                break;

        }
        System.out.println("time in "+stad+ " is : "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        ZoneId stk = ZoneId.of("CET");
        ZoneId tor = ZoneId.of("America/Toronto");
        ZoneId sha = ZoneId.of("Asia/Shanghai");
        LocalTime stock = LocalTime.now(stk);
        LocalTime toro = LocalTime.now(tor);
        LocalTime shan = LocalTime.now(sha);        LocalTime l = LocalTime.now();

        Instant t = Instant.now();
        ZonedDateTime zdt = t.atZone(tor);
                System.out.println(l);
        System.out.println(stock.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(toro.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(shan.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    public static void main(String[] args) {
        Tid t = new Tid();
    }
}
