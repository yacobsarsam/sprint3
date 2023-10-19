package ovning12;

public class Båt extends Fordon implements Printable{

    int dödvikt;

    public Båt(int dödvikt,int hastighet,int vikt) {
        super(vikt, hastighet);
        this.dödvikt = dödvikt;
    }

    @Override
    public void printMe() {
        System.out.println("Båtvikt: " + vikt + " har hastighet " + hastighet
                + " med dödvikt " + dödvikt);
    }

    public void sväng (){}
}
