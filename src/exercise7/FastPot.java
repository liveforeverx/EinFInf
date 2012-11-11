package exercise7;

public class FastPot {
    
    static int counter;

    public static double fastPotRek(double x, int n){
        counter++;
        if(n == 0) return 1;
        if(n % 2 == 0) return fastPotRek(x*x, n/2);
        else return x * fastPotRek(x, n-1);
    }

      public static double fastPotIter(double x, int n){
          if(n == 0) return 1.0;
          double res = 1;
          while(n >= 1) {
              counter++;
              if(n % 2 == 0){ x*=x; n/=2; }
              else { res*=x; n--;  }
          }
          return res;
      }

      public static void main(String[] args) {
          double a = 2;
          int n = 13;
          counter = 0;
          System.out.println((int)fastPotRek(a, n));
          System.out.println(counter);
          counter = 0;
          System.out.println((int)fastPotIter(a, n));
          System.out.println(counter);
      }
 
    
}
