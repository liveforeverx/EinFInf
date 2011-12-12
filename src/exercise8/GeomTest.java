package exercise8;

public class GeomTest {

    public static void main(String[] args) {
        Point a = new Point(1,2);
        System.out.println(a);
        a.translate(1, 1);
        System.out.println(a);
        Line b = new Line(new Point(0, 0), new Point(3,3));
        System.out.println(b);
        b.translate(2, 2);
        System.out.println(b);
    }
}
