package exercise6;

import java.util.*;

public class Conflict {

	/*
	 */
	
	public static int wife(int n) {
		if(n==0) return 1;
		else return n - husband(wife(n-1));
	}

	public static int husband(int n) {
		if(n==0) return 0;
		else return n - wife(husband(n-1));
	}

	public static boolean fight(int n) {
		return !(wife(n)==husband(n));
	}

	public static int[] differenceFights(int n) {
		int[] difference = new int[n];
		int yearcounter = 1;
		int counter = 1;
		for(int i=0; i<n; i++){
			while(fight(counter++) != true)
				yearcounter++;
			difference[i] = yearcounter;
			yearcounter = 1;
		}
		return difference;
	}

	public static void main(String args[]) {
		/*
		 * In Zahlenfolgen erkennt man die Fibonacci Zahlen
		 */
		print(differenceFights(9));
		System.out.println(fight(7));
		System.out.println(fight(25));
		/*
		 * In kupferne findet die Streit sich.
		 * In Silberne findet die Streit nicht.
		 */
	}
	
	public static void print(int[] array){
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}