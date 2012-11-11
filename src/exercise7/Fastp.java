package exercise7;

import java.util.Scanner;

public class Fastp {
    public static double fastPotRek(double x, int n) {
        if (n == 0)
            return 1;
        else if ((n % 2) != 0)
            return fastPotRek(x * x, (n - 1) / 2) * x;
        else
            return fastPotRek(x * x, (n / 2));
    }

    public static double fastPotIter(double x, int n) {
        double result = 1;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            if(n % 2 == 0) 
            { 
                x*=x; 
                n/=2;
            }
            else { result*=x; n--;  } 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println();

        if (n >= 0) {
            System.out.print("\nRekursive Methode:(" + x + ", " + n + ") = "
                    + fastPotRek(x, n));
            System.out.print("\nIterative Methode:(" + x + ", " + n + ") = "
                    + fastPotIter(x, n));
            System.out.println();
        } else
            System.out.print(n + " keine gueltige Eingabe.\n");
    }
}