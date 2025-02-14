package rectangletest;
class Rectangle {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.length = 10;
        a.breadth = 8;
        System.out.println("Area: " + a.area());
        System.out.println("Perimeter: " + a.perimeter());
        System.out.println("Is Square: " + a.isSquare());
    }
}
