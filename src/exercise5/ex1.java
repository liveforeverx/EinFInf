package exercise5;

import java.math.BigInteger;

public class ex1 {
	/*
	 * 4) Es gibt die Probleme bei Berechnung des Ackermann-funktiones, 
	 * weil die Java hat eine Begrenzung für die Tiefe des Rekursions.
	 */
	public static BigInteger ackermann(BigInteger x, BigInteger y) {
		if (y.equals(new BigInteger("0")))
			return new BigInteger("0");
		else if (x.equals(new BigInteger("0")))
			return y.multiply(new BigInteger("2"));
		else if (y.equals(new BigInteger("1")))
			return new BigInteger("2");
		else
			return ackermann(x.add(new BigInteger("-1")),
					ackermann(x, y.add(new BigInteger("-1"))));
	}

	public static void main(String[] args) {
		//System.out.println(ackermann(new BigInteger("1"), new BigInteger("10")));
		//System.out.println(ackermann(new BigInteger("4"), new BigInteger("4")));
		//System.out.println(ackermann(new BigInteger("3"), new BigInteger("3")));
		//print(BigInteger.ZERO, 5);
		//print(BigInteger.ONE, 5);
		//print(new BigInteger("2"), 5);
	}

	public static void print(BigInteger x, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(ackermann(x, new BigInteger(Integer.toString(n))));
		}
	}
}
