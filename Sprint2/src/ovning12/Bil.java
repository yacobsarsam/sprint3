package ovning12;

public class Bil extends Fordon implements Printable, Hjulburen {

    int antalVäxlar, växelJustNu,antalHjul;

    protected Bil(int antalVäxel,int hastighet, int vikt, int antalHjul){
        super(vikt,hastighet);
        this.antalVäxlar=antalVäxel;
        this.växelJustNu=1;
        this.antalHjul=antalHjul;
    }

    @Override
    public void printMe() {
        System.out.println("Bilvikt: " + vikt + " har hastighet " + hastighet
                + " med antal växlar " +antalVäxlar );
    }

    public void växla (int växel){
        this.växelJustNu = växel;
    }

    @Override
    public int getAntalHjul() {
        return antalHjul;
    }
}
