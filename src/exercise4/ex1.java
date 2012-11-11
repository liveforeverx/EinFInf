package exercise4;

public class ex1 {

	/**
	 * @param args
	 * 
	 * public static double evalSimple(double[] a, double x){
double y=a[0];
for(int i=1; i<a.length; i++){
int xInPotenz = x;
for(int j=1; j<i; j++)
	xInPotenz = xInPotenz * x;
y=y+a[i] * xInPotenz;

}
return y;
}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[3];
		a[0] = 1;
		a[1] = -3;
		a[2] = 4;
		System.out.println(evalSimple(a, 3));
		System.out.println(evalHorner(a, 4));
		System.out.println(horner(a, 3, a.length-1));
		System.out.println(horner(a, 4, a.length-1));
	}
	public static double evalSimple(double[] a, double x){
		double sum = a[0];
		for(int i = 1; i<a.length; i++){
			sum+= a[i] * pow(x, i);
		}
		return sum;
	}
	
	public static double evalHorner(double[] a, double x){
		double result = a[a.length-1];
		for(int i=a.length-2; i>=0; i--){
			result = result*x + a[i]; 
		}
		return result;
	}
	
	public static double horner(double[] a, double x, int n){ //n=Grad des Polynoms
		double h; //momentane Funktionswert des Polynoms, wird benötigt zur Berechung des nächsten Funktionswertes
		if(n>0) //Aufrufen der Funktion horner() mit dem verminderten n
				h=horner(a, x, n-1);
		else //wenn n<=0 wird der Funktionswert des 0.Grades zurückgegeben
		return a[n];
		return h*x+a[n];
		}
			
	public static double evalSimple2(double[] a, double x){
		double y=0;
		for(int i=a.length-1; i>=0; i--)
		y=a[i]+y*x;
		return y;
		}

		public static double evalHorner2(double[] a, double x){
		if(a.length==0)return 0;
		double y;
		int i;
		for(i=a.length-1,y=a[a.length-1];i>0;i--)
		y=y*x+a[i-1];
		return y;

		}
	
	public static double evalHornerRek(double[] a, double x){
		return evalHornerRek(a, x, 0);
	}
	
	public static double evalHornerRek(double[] a, double x, int i){
		if(i<a.length-1)
			return a[i] + x* evalHornerRek(a, x, i+1);
		else
			return a[a.length-1];
	}


	public static double pow(double digit, double n){
		double buffer = digit;
		for(int j = 1; j<(int)n; j++){
			buffer*=digit;
		}
		return buffer;
	}
}
