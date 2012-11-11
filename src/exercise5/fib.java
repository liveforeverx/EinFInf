package exercise5;

import java.math.BigInteger;
import java.util.Scanner;

public class fib {
	public static BigInteger ONE = new BigInteger("1");
	public static BigInteger ZERO = new BigInteger("0");
	public static int counter;

	public static BigInteger fib1(int n) {
		anzahlAufrufe++;
		if ((n == 0) || (n == 1)) {
			return ONE;
		} else
			return fib1(n - 2).add(fib1(n - 1));
	}

	static int anzahlAufrufe = 0;

	public static BigInteger fib2(int n) {
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		while (--n > -1) {
			AnzahlAufrufe++;
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return b;
	}

	static int AnzahlAufrufe = 0;

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("==============================================");
	//	System.out.println("**Es wird von einer natürlichen Zahl**");
	//	System.out.println("**die Fibonacci-Zahl nach der rekursiven **");
	//	System.out.println("**und nach der iterativen Variante berechnet.**");
	//	System.out.println("===============================================\n");
		for(int i=1; i<25; i++){
			System.out.println(i + " = " +fib2(i));
		}
	//	System.out.print("Zahl = ");
	//	int n = sc.nextInt();
	//	System.out.println();

	//	if (n >= 0) {
		//	BigInteger ergebnis;
		//	ergebnis = fib1(n);
		//	System.out.println();
		//	System.out.println("fib1(" + n + ")=" + ergebnis + "\n");
		//	System.out.println(" Anzahl der Schleifendurchläufe: "
		//			+ anzahlAufrufe);
		//	ergebnis = fib2(n);
		//	System.out.println();
		//	System.out.println("fib2(" + n + ")=" + ergebnis + "\n");
		//	System.out.println(" Anzahl der Schleifendurchläufe: "
		//			+ AnzahlAufrufe);
	//	}
	}
}
