package ovning1;

public class Triangle {
    int höjd, bredd;


    public double getArea(int h, int b) {
        return (h * b)/2;
    }

    public double getCircumference(int h, int b) {
        return (b+2 * Math.sqrt(Math.pow(h,2)+Math.pow(b,2)/4));
    }
}
