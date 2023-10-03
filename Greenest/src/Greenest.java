public class Greenest {
    private Greenest() {
        VäxtRekord vr = new VäxtRekord();
        vr.SkapaVäxter();
        InputOutput.InputHanterare(vr);
    }
    public static void main(String[] args) {

        Greenest gr = new Greenest();
    }
}

