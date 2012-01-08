package exercise10;
import exercise10.InvalidTriangleException;

public class Triangle {
    double a, b, c;
    
    public Triangle(double a, double b, double c) throws InvalidTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        checkTriangle();
    }
    
    private void checkTriangle() throws InvalidTriangleException{
        boolean check = true;
        if(a + b < c) check = false;
        else if(b + c < a) check = false;
        else if(a + c < b) check = false;
        if(!check)throw new InvalidTriangleException();
        
    }
    
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    public double getPerimeter(){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        try {
            Triangle A = new Triangle(2, 2, 2);
            System.out.println(A.getArea());
            System.out.println(A.getPerimeter());         
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        try {
            Triangle A = new Triangle(2, 5, 2);
            System.out.println(A.getArea());
            System.out.println(A.getPerimeter());         
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
           
    }
    
}
