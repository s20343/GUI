package Task2.task;

public class Diamond extends GeometricPrimitive {
    private int a;   // side
    private int b;   // side
    private int c;   // diagonal
    private int d;   // diagonal

    public Diamond(int a, int b, int c, int d) {
        super(a, b, c, d);
        this.a =a;
        this.b =b;
        this.c =c;
        this.d =d;
    }

    @Override
    public int perimeter() {
        return 2*a+2*b;
    }

    @Override
    public int area() {
        return c*d/2;
    }

    @Override
    public String toString() {
        return "Diamond side1="+a+" side2="+b+" diagonal1="+c+" diagonal2="+d;
    }
}