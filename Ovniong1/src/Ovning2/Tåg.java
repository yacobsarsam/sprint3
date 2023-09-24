package Ovning2;

public class Tåg extends Fordon implements Printable, Hjulburen{
    int antalVagnar, antalHjul;

    public Tåg(int antalVagnar,int hastighet,int vikt, int antalHjul) {
        super(vikt,hastighet);
        this.antalVagnar = antalVagnar;
        this.antalHjul=antalHjul;
    }

    @Override
    public void printMe() {
        System.out.println("Tågvikt: " + vikt + " har hastighet " + hastighet
                + " med antal vagnar " +antalVagnar );
    }

    public void kopplaVagn(int antal){
        this.antalVagnar=antalVagnar+antal;
    }

    @Override
    public int getAntalHjul() {
        return antalHjul*antalVagnar;
    }
}
