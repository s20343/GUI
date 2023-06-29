package Task2.task;

public class Square extends GeometricPrimitive {

    private int a;   // side

    public Square(int a) {
        super(a);

        this.a= a;

    }

    @Override
    public int perimeter() {
        return 4*a;
    }

    @Override
    public int area() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square side="+a;
    }
}

