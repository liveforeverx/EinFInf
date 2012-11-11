package exercise5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class ex2 {
	
private static int counter;
	
public static BigInteger fib1(int n) {
	counter++;
	if(n==0) return BigInteger.ONE;
	if(n==1) return BigInteger.ONE;
	else return fib1(n-2).add(fib1(n-1));
}

public static BigInteger fib2(int n) {
	BigInteger a = new BigInteger("0");
	BigInteger b = new BigInteger("1");
	for(int i=0; i<n; i++){
		counter++;
		BigInteger c = a.add(b);
		a = b;
		b = c;
	}
	return b;
}

public static void main(String[] args) {
	for(int i=0; i<16; i++)
		System.out.println(fib1(i));
	counter = 0;
	System.out.println(fib1(5));
	System.out.println(counter);
	counter = 0;
	System.out.println(fib2(5));
	System.out.println(counter);
	counter = 0;
	System.out.println(fib1(23));
	System.out.println(counter);
	counter = 0;
	System.out.println(fib2(23));
	System.out.println(counter);
	for(int i=1; i<20; i++){
		BigInteger oldx = fib2(i-1);
		BigInteger newx = fib2(i);
		BigDecimal sp = new BigDecimal(newx);
		BigDecimal div = new BigDecimal(oldx);
		System.out.println(sp.divide(div, MathContext.DECIMAL128));
	}
	}
}
