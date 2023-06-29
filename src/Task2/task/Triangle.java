package Task2.task;

public class Triangle extends GeometricPrimitive {

    private int a;   //side
    private int b;   //base
    private int c;  // side
    private int d;   // height

    public Triangle(int a, int b, int c, int d) {
        super(a, b, c, d);
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    @Override
    public int perimeter() {
        return a+b+c;
    }

    @Override
    public int area() {
        return a*d/2;
    }

    @Override
    public String toString() {
        return "Triangle first_side="+a+" base="+b+" second_side="+c+" height="+d;
    }
}
