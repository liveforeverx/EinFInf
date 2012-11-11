package exercise2;

import java.util.Scanner;

public class Median {
	public static int median(int a, int b, int c) {

		if (a <= b && a >= c || a >= b && a <= c) return a;

		else if (b <= a && b >= c || b >= a && b <= c) return b;

		else return c;

	}

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		c = sc2.nextInt();
		System.out.println("Median Ergebnis = " + Median.median(a, b, c));

	}
}
