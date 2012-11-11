package exercise9;

public class ChristmasPresents {
    
    public static void main(String[] args) {
        Present[] presentsBag = new Present[12];
        for(int i = 0; i<5; i++){
            presentsBag[i] = new Cylinder(random(3, 6), random(3, 5));
        }
        presentsBag[5] = new Ball(random(70, 80));
        presentsBag[6] = new Ball(random(60, 90));
        presentsBag[7] = new Cuboid(random(10, 15), random(10, 15), random(25, 20));
        presentsBag[8] = new Cuboid(random(10, 15), random(10, 15), random(25, 20));
        for(int i = 9; i<12; i++){
            presentsBag[i] = new Cuboid(inM(15), inM(8), inM(2));
        }
        double rolles = 0.0;
        double ribbon = 0.0;
        for(int i=0; i<presentsBag.length; i++){
            rolles += presentsBag[i].computePaperSize();
            ribbon += presentsBag[i].computeRibbonLength();
        }
        
        System.out.println("Your need rolles for all presents: " + (int)(rolles/5) + 1);
        System.out.println("Your need ribbon for all presents: " + (int)(ribbon) + 1 + " m^2");

    }

    // in cm between first and second and return in m
    private static double random(int first, int second){
        // in cm
        int cm = first + (int)(Math.random() * (second - first));
        // in m
        return inM(cm);
    }
    
    private static double inM(int cm){
        return (double)cm / 100;
    }
}
