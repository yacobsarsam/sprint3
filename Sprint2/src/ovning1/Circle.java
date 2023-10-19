package ovning1;

public class Circle implements Figure {
    int r;
    public double getArea(int r, int rr) {
        return Math.pow(r,2)*Math.PI;
    }

    public double getCircumference(int r, int rr) {
        return 2*Math.PI*r;
    }
}
