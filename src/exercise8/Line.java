package exercise8;

public class Line implements Movable {
    Point start;
    Point end;
    
    public Line(int startx, int starty, int endx, int endy){
        start = new Point(startx, starty);
        end = new Point(endx, endy);
    }
    
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }
    
    public double length(){
        return start.distance(end);
    }

    @Override
    public void translate(int dx, int dy) {
        start.translate(dx, dy);
        end.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Line:{" + start.toString() + ", " + end.toString() + "}";
    }
   
    
    
}
