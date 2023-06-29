package Task2.task.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Task2.task.*;

import java.io.*;
import java.util.ArrayList;

public class Test1 {

    @Test
    public void rectangleTest() throws IOException {
        Rectangle rectangle = new Rectangle(2, 8);
        int area = (int) Math.round(rectangle.area());
        assertEquals(16, area);
        int perimeter = (int) Math.round(rectangle.perimeter());
        assertEquals(20, perimeter);
    }
    @Test
    public void diamondTest() throws IOException {
        Diamond diamond = new Diamond(2, 2, 4, 4);
        int area = (int) Math.round(diamond.area());
        assertEquals(8, area);
        int perimeter = (int) Math.round(diamond.perimeter());
        assertEquals(8, area);
    }

    @Test
    public void parallelogramTest() {
        Parallelogram parallelogram = new Parallelogram(2, 8, 5);
        int area = (int) Math.round(parallelogram.area());
        assertEquals(area, 16);
        int perimeter = (int) Math.round(parallelogram.perimeter());
        assertEquals(perimeter, 26);
    }
    @Test
    public void trapeziumTest() {
        Trapezium trapezium = new Trapezium(8, 4, 2, 5, 5);
        int area = (int) Math.round(trapezium.area());
        assertEquals(area, 30);
        int perimeter = (int) Math.round(trapezium.perimeter());
        assertEquals(perimeter, 19);
    }
    @Test
    public void triangleTest() {
        Triangle triangle = new Triangle(2, 8, 4, 4);
        int area = (int) Math.round(triangle.area());
        assertEquals(area, 4);
        int perimeter = (int) Math.round(triangle.perimeter());
        assertEquals(perimeter, 14);
    }
    @Test
    public void circleTest() throws IOException {
        Circle circle = new Circle(4);
        int area = (int) Math.round(circle.area());
        assertEquals(48, area);
        int perimeter = (int) Math.round(circle.perimeter());
        assertEquals(24, perimeter);
    }
    @Test
    public void squareTest() throws IOException{
        Square square = new Square(2);
        int area = (int) Math.round(square.area());
        assertEquals(area, 4);
        int perimeter = (int) Math.round(square.perimeter());
        assertEquals(perimeter, 8);
    }
    @Test
    public void geometricPrimitiveTest() throws IOException{
        ArrayList myList=new ArrayList();
        Triangle triangle = new Triangle(2, 2,4,5);
        Trapezium trapezium = new Trapezium(6, 7,2,8,5);
        Parallelogram parallelogram = new Parallelogram(2, 5,4);
        Diamond diamond = new Diamond(3, 3, 6,5);
        Square square = new Square(5);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(6, 7);


        myList.add(triangle.perimeter());
        myList.add(trapezium.perimeter());
        myList.add(diamond.perimeter());
        myList.add(square.perimeter());
        myList.add(circle.perimeter());
        myList.add(parallelogram.perimeter());
        myList.add(rectangle.perimeter());
        myList.add(triangle.area());
        myList.add(trapezium.area());
        myList.add(diamond.area());
        myList.add(square.area());
        myList.add(rectangle.area());
        myList.add(parallelogram.area());
        myList.add(circle.area());

        int sum=0;
        for(int i=0; i< myList.size();i++){
            sum += (int)myList.get(i);
        }
        assertEquals(306,sum);
    }
}