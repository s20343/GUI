package Task2.task;

public abstract class GeometricPrimitive {

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public GeometricPrimitive(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public GeometricPrimitive(int c, int a, int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }

    public GeometricPrimitive(int a) {
        this.a = a;
    }

    public GeometricPrimitive(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public GeometricPrimitive(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    protected GeometricPrimitive() {
    }



    public abstract int perimeter();
    public abstract int area();

}

