package exercise9;

public class Cuboid extends Present{
    
    public Cuboid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double length;  // in meter
    double width;   // in meter
    double height;   // in meter
    
    @Override
    double surface() {
        return 2*(length * width + width * height + length * height);
    }
    
    @Override
    double surfaceRibbon() {
        return 2*(length + width + 2*height);
    }

}
