package exercise9;

public abstract class Present {
    abstract double surface();
    abstract double surfaceRibbon();
    
    double computeRibbonLength(){
        return surfaceRibbon() * 1.1;
    };
    double computePaperSize(){  // same for all presents
        return surface() * 1.5;  // 50% waste
    }        

}
