package exercise7;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LittleFermat {
    public static BigInteger getRandom(BigInteger n) {
        return new BigDecimal(n).multiply(new BigDecimal(Math.random())).toBigInteger();
     }

     public static boolean primeTest(BigInteger p) {
         for(int i=0; i<9; i++){
             BigInteger a = getRandom(p);
             if(a.modPow(p, p).compareTo(a.mod(p)) != 0) return false;
         }
         return true;
     }
     public static void main(String[] args) {
         //for(int i=2; i<1000; i++)
         //if(primeTest(new BigInteger(Integer.toString(i))))
         //System.out.println(i);
         System.out.println("erste:");
         for (int i = 0; i < 9; i++) {
            System.out.println(i);
         }
         System.out.println("zweite:");
         for (int j = 0; j < 9; ++j) {
             System.out.println(j);
         }
         
     }
}
