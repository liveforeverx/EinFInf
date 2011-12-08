package exercise8;

public class Point implements Movable{
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    
    @Override
    public void translate(int dx, int dy) {
        this.x += dx ;
        this.y += dy;
    }
    
    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
    }

    @Override
    public String toString() {
        return "Point: {x=" + x + ", y=" + y + "}";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
