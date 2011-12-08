package exercise8;

public class Triangle implements Movable {

    Point a; 
    Point b; 
    Point c;
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void translate(int dx, int dy) {
        a.translate(dx, dy);
        b.translate(dx, dy);
        c.translate(dx, dy);
    }
    @Override
    public String toString() {
        return "Triangle {" + a.toString() + ", " + b.toString() + ", " + c.toString() + "}";
    }
    
    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

}
