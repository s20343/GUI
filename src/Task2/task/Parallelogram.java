package Task2.task;

public class Parallelogram extends GeometricPrimitive {

    private int a;   // top and bottom
    private int b;   // side sides
    private int c;   // h
    public Parallelogram(int c, int a, int b) {
        super(c, a, b);
        this.a=a;
        this.b=b;
        this.c=c;
    }


    @Override
    public int perimeter() {
        return 2*a+2*b;
    }

    @Override
    public int area() {
        return c*a;
    }

    @Override
    public String toString() {
        return "Parallelogram top_bottom="+a+" sides="+b+" height="+c;
    }
}
