
public class Triangle extends Shape{

    private int a,b,c;

    public Triangle() {
        super("Triangle");
    }

    public void setSides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
