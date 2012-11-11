package exercise3;

public class ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(shuffleNumber(52));
		int a, b;
		int c = 0;
		for(int i=4; i<10000; i+=2){
			a = shuffleNumber(i); 
			b = shuffleNumber2(i);
			System.out.println("array i = " + i + " result a: " + a + " result b: " + b);
			if(a != b)c++;
		}
		System.out.println("Ready " + c);
	}

	public static int[] interleave(int[] a, int[] b)
	{
		int[] c = new int[a.length+b.length];
		for(int i=0; i<c.length; i++)
			c[i] = (i%2 == 0) ? a[i/2] : b[i/2];
		return c;
	}
	
	public static int[] shuffle(int[] a)
	{
		int[] b = concat(a, 0, a.length/2);
		int[] c = concat(a, a.length/2, a.length);
		int[] shuffled = interleave(b, c);
		return shuffled;
	}
	
	public static int shuffleNumber(int n)
	{
		int result = 0;
		int[] a = create(n);
		do{
			result++;
			a = shuffle(a);
		}while(a[n-2] != n-1);
		return result;
	}
	
	public static int shuffleNumber2(int n)
	{
		int result = 0;
		int[] a = create(n);
		int[] b = create(n);
		do{
			result++;
			a = shuffle(a);
		}while(!equals(a, b));
		return result;
	}
	
	public static boolean equals(int[] a, int[] b){
		boolean result = true;
		for(int i=0; i<a.length; i++)
			if(a[i] != b[i]) result = false;
		return result;
	}
	
	public static void print(int[] a){
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] concat(int[] array, int begin, int end){
		int[] newarray = new int[end-begin];
		for(int i = 0; i<newarray.length; i++){
			newarray[i] = array[begin + i];
		}
		return newarray;
		
	}
	
	public static int[] create(int length){
		int[] array = new int[length];
		for(int i=0; i< array.length; i++)
		{
			array[i] = i+1;
		}
		return array;
	}
	
}
