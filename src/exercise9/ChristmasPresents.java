package exercise9;

public class ChristmasPresents {
    
    public static void main(String[] args) {
        Present[] presentsBag = new Present[3];
        presentsBag[0] = new Ball(0.7);
        presentsBag[1] = new Cylinder(0.5, 0.5);
        presentsBag[2] = new Cuboid(0.5, 0.5, 0.5);
        double rolles = 0.0;
        double ribbon = 0.0;
        for(int i=0; i<presentsBag.length; i++){
            rolles += presentsBag[i].computePaperSize();
        System.out.println("Your need rolles for all presents: " + (int)(rolles/5) + 1);
            ribbon += presentsBag[i].computeRibbonLength();
        System.out.println("Your need ribbon for all presents: " + (int)(ribbon) + 1 + " m^2");
        }
        System.out.println("Your need rolles for all presents: " + (int)(rolles/5) + 1);
        System.out.println("Your need ribbon for all presents: " + (int)(ribbon) + 1 + " m^2");
    }

    // in cm between first and second and return in m
}
