package exercise9;

public class Ball extends Present {

    public Ball(double radius) {
        super();
        this.radius = radius;
    }

    double radius;  // in meter
    
    @Override
    double surface() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    double surfaceRibbon() {
        return 4 * Math.PI * radius;
    }
    
}
