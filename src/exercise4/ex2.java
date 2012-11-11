package exercise4;

public class ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {24.0, 24.0, 12.0, 4.0};
		double[] c = diffPoly(a, 2);
		for(int i=0; i<c.length; i++)
			System.out.print(c[i] + " ");
		//System.out.println(intPoly(a, 0, 1));
		//print(diffPoly(a, 2));
	}
	
	public static double[] create(int length){
		double[] array = new double[length];
		for(int i=0; i< array.length; i++)
		{
			array[i] = i+1;
		}
		return array;
	}
	
	public static double[] diffPoly(double[] coeffs, int ableitungstiefe){ 
		double[] newArray = new double[coeffs.length-ableitungstiefe];
		for(int i=coeffs.length-1; i>=0; i--){
			if((i-ableitungstiefe)>=0)
				if(ableitungstiefe>=0) newArray[i-ableitungstiefe] = coeffs[i] * specfac(i, ableitungstiefe);
				else newArray[i-ableitungstiefe] = coeffs[i] / specfac(i+1, ableitungstiefe);
			else break;
		}
		return newArray;
	}
		
	public static double intPoly(double[] coeffs, double x0, double x1){
		double[] stfunc = diffPoly(coeffs, -1);
		return evalHorner(stfunc, x1) - evalHorner(stfunc, x0);
	}

	public static double evalHorner(double[] a, double x){
		double result = a[a.length-1];
		for(int i=a.length-2; i>=0; i--){
			result = result*x + a[i]; 
		}
		return result;
	}
	
	public static int specfac(int a, int n){
		int result = 1;
		int x;
		if(n>=0)x = -1; else x=1;
		for(int i=a; i!=(a-n); i+=x){
			result *= i;
		}
		return result;
	}
	
	public static void print(double[] a){
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	
}
