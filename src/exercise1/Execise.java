package exercise1;

import java.util.Scanner;

public class Execise{

	 public static void main(String[] Args){
		/* Scanner scanner = new Scanner(System.in);
		 int digit = scanner.nextInt();
		 System.out.println(isPrime(digit));
		 System.out.println(nextPrime(digit)); */
		 System.out.println(perfectdigit());
		
	  }
	  
	  public static boolean isPrime(int n){
	    if(n == 1) return false;
	    if(n == 2) return true;
	    if(n % 2 == 0) return false;
	    double big = Math.sqrt(n);
	    for(int i=3; i<=big; i+=2)
	      if(n % i == 0) return false;
	    return true;
	  }

	  public static void kubikwurzel(){
	    Scanner scanner = new Scanner(System.in);
	    double digit = (double)scanner.nextInt();
	    double a = digit;
	    double b = 1;
	    while( Math.abs(a - b) > 0.00001 ) {
	      a = (a + b + b)/3;
	      b = Math.sqrt(digit / a);
	    }
	   System.out.println(a);
	  }
	 
	public static boolean perfectdigit(){
	    Scanner scanner = new Scanner(System.in);
	    int digit = scanner.nextInt();
	    int sum;
	      sum = 0;
	      for(int i = 1; i<=digit / 2; i++)
	        { 
	          //sum += ((digit % i==0) ? i : 0 );
	          if(digit % i == 0)sum = sum + i;
	        }
	      if(sum == digit) return true; else return false;
	  // Programm end  
	  }

	  public static int nextPrime(int n){
		if(n==1)return 2;
		if(n==2)return n;
		if(n%2 == 0)n++;
	    while (isPrime(n) != true)
	    	n+=2;
		return n;
	  }

}
