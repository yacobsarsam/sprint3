package ovning1;

public class Square implements Figure{

    int length, width;
    @Override
    public double getArea(int length, int width) {
        return length*width;
    }

    @Override
    public double getCircumference(int length, int width) {
        return (length+width)*2;
    }
}
