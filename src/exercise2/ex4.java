package exercise2;

public class ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = create(10);
		for(int i = 0; i<10; i++)
			if(array[i] < 5 || array[i] > 99) System.out.println(array[i]);
		System.out.println(toString(array));
		System.out.println(posMin(array));
		System.out.println(specialSum(array));
		int[] specArray = {20, 40, 26, 52, 104, 208};
		System.out.println(specialSum(specArray));
	}

	
	public static int[] create(int n){
		int[] newArray = new int[n];
		int maxrand = 94;
		for(int i = 0; i<n; i++){
			newArray[i] = (int)(maxrand*Math.random()) + 5;
		}
		return newArray;
	}

	public static String toString(int[] a){
		String newString = new String();
		for(int i = 0; i<a.length; i++){
			//newString += Integer.toString(a[i]);
			newString += Integer.toString(a[i]) + " ";
		}
		return newString;
	}

	public static int posMin(int[] a){
		int minpos = 0;
		int minel = a[0];
		for(int i = 1; i<a.length; i++)
			if(a[i]<minel)
			{
				minpos = i;
				minel = a[i];
			}
		return minpos+1;
	}

	public static int specialSum(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++)
			if((a[i] % 13 == 0) || (a[i] % 4 == 0)) ; else sum+=a[i];
		return sum;
	}
}
