package Task2.task;

public class Rectangle extends GeometricPrimitive {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int perimeter() {
        return 2*a+2*b;
    }

    @Override
    public int area() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle long_side="+a+" short_side="+b;
    }
}

