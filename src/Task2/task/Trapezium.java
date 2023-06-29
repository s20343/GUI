package Task2.task;

public class Trapezium extends GeometricPrimitive {
    private int a; //long side
    private int b;   //short side
    private int c;   // c and d are triangle sides
    private int d;
    private int e;   // height

    public Trapezium(int a, int b, int c, int d, int e) {
        super(a, b, c, d, e);
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }

    @Override
    public int perimeter() {
        return a+b+c+d;
    }

    @Override
    public int area() {
        return e*((a+b)/2);
    }

    @Override
    public String toString() {
        return "Trapezium long_side="+a+" short_side="+b+" triangle_side1="+c+" triangle_side2="+d+" height="+e;
    }
}
