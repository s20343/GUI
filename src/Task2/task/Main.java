package Task2.task;


import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 2,4,5);
        Trapezium trapezium = new Trapezium(6, 7,2,8,5);
        Parallelogram parallelogram = new Parallelogram(2, 5,4);
        Diamond diamond = new Diamond(3, 3, 6,5);
        Square square = new Square(5);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.area();
        circle.perimeter();

        diamond.area();
        diamond.perimeter();

        parallelogram.area();
        parallelogram.perimeter();

        triangle.area();
        triangle.perimeter();

        trapezium.area();
        trapezium.perimeter();

        rectangle.area();
        rectangle.perimeter();

        square.area();
        square.perimeter();
    }
}
