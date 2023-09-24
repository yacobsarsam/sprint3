package Ovning2;

public abstract class Fordon {
    int hastighet, vikt;

    public Fordon() {}

    protected Fordon(int vikt) {
        this.vikt = vikt;
    }

    public Fordon( int vikt ,int hastighet) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void ändraHastighet(int hastighet){
        this.hastighet=hastighet;
    }
public abstract void printMe();

    public static void main(String[] args) {
        Bil bil1= new Bil(6,140, 1350,4);
        Tåg tåg1= new Tåg(10,400, 10000,4);
        Båt båt1= new Båt(1000, 50, 700);
        Cykel cykel1 = new Cykel(3,30,50);
        bil1.printMe();
        tåg1.printMe();
        båt1.printMe();
        cykel1.printMe();
        System.out.println("Antal hjul bil = " +bil1.getAntalHjul());

        System.out.println("Antal hjul tåg= " +tåg1.getAntalHjul());

    }
}


