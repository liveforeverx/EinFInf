package exercise2;

public class ex1 {
	
	static int myGV;
	
	public static void main(String[] args) {
		System.out.println(median(9, 6, 3));
		System.out.println(median(3, 6, 9));
		System.out.println(median(6, 3, 9));
		System.out.println(median(6, 9, 3));
		System.out.println(median(3, 9, 6));
		System.out.println(median(3, 4, 4));
	}

	
	public static int median2(int a, int b, int c) {
		if(a >= b && b >= c) return b; else
		if(c >= b && b >= a) return b; else
		
		if(a >= c && c >= b) return c; else
		if(b >= c && c >= a) return c; else return a;
	}
	
	
	public static int median(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		if(array[1] > array[2]) swap(array, 1, 2);
		if(array[0] > array[1]) swap(array, 0, 1);
		if(array[1] > array[2]) swap(array, 1, 2);
		return array[1];
	}
	
	public static void swap(int[] array, int first, int second) {
		array[first] = array[first] ^ array[second];
		array[second] = array[second] ^ array[first];
		array[first] = array[first] ^ array[second];
	}
}
