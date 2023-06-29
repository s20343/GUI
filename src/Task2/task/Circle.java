package Task2.task;


public class Circle extends GeometricPrimitive {

    private int a;   // r

    public Circle(int a) {

        this.a = a;
    }

    public Circle() {

    }

    @Override
    public String toString() {
        return "Circle r="+a;
    }

    @Override
    public int perimeter() {
        return 2*(int) Math.PI*a;
    }

    @Override
    public int area() {
        return a*a*(int) Math.PI;
    }
}
