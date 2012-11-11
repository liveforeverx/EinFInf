package exercise3;

public class ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(4,2));
		System.out.println(f(8,5));
		System.out.println(f(10,4));
		System.out.println(f(10,6));

	}

	// Quadrat des Zahles
	public static int f2(int n) {
		if(n == 1) return 1; else
			return f2(n-1) + 2*n - 1;
	}
	
	public static double f(double x, double y){
		//System.out.println("function: " + x + " " + y);
		if(y == 0) {//System.out.println("return 1"); 
			return 1;}
		else if(x<y*2) { //System.out.println("x<y*2, stack start f(x,x-y)"); 
			return f(x, x-y);}
		else {
			//System.out.println("else: steck start");
			double a = f(x-1, y-1);
			//System.out.println("else: steck result:" + a);
			System.out.println("fun " + x + " " + y + " -> result = " + (x*a/y));
				return x*a/y;
	}
	}

}
