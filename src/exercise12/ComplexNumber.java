package exercise12;

public class ComplexNumber {
    public ComplexNumber(double real, double imag) {
        super();
        this.real = real;
        this.imag = imag;
    }
    
    private class InvalidInputForSquareRoot 
          extends RuntimeException {
        public InvalidInputForSquareRoot(String Name) {
           super(Name);
        }

        /**
         * 
         */
        private static final long serialVersionUID = 1L;
       // hier bitte Quelltext einfuegen
    }
    private double real;  
    private double imag;

    public ComplexNumber add(ComplexNumber k) {
        return new ComplexNumber(real + k.real, imag + k.imag);     
    }
    public ComplexNumber mult(ComplexNumber k) {
        return new ComplexNumber(real * k.real - imag * k.imag, 
                                 real * k.imag + k.real * imag);
    }
    public double absoluteValue() {
        return Math.sqrt(imag * imag + real * real);
    }
    public ComplexNumber sqrt() throws InvalidInputForSquareRoot {
        if(imag != 0) throw(new InvalidInputForSquareRoot("Imag not a zero"));
        if(real >= 0) return new ComplexNumber(Math.sqrt(real), 0);
        else return new ComplexNumber(0, Math.sqrt(-1*real));
    }
    public String toString() {
      return real + " + " + imag + "*i";
    }
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(1, 2);
        ComplexNumber c = new ComplexNumber(9, 0);
        ComplexNumber d = new ComplexNumber(4, 3);
        System.out.println(a.add(b).toString());
        System.out.println(a.mult(b).toString());
        System.out.println(d.absoluteValue());
        try {
            System.out.println(d.sqrt());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        System.out.println(c.sqrt());
    }
  }