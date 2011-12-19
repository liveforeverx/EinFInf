package exercise9;

public class Cylinder extends Present {

    public Cylinder(double height, double diameter) {
        super();
        this.height = height;
        this.diameter = diameter;
    }

    double height ;  // in meter
    double diameter; // in meter
    
    @Override
    double surface() {
        return Math.PI * diameter * (height + diameter/2);
    }

    @Override
    double surfaceRibbon() {
        return 4 * (height + diameter);
    }

}
