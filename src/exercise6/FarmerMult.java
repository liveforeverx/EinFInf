package exercise6;

public class FarmerMult {

	/**
	 * @param args
	 */
	public static int farmerMultRek(int x, int y) {
		if(x == 1)return y; else
		if(x % 2 == 1) return y + farmerMultRek(x/2, y*2); 
		else return farmerMultRek(x/2, y*2);	
	}

	public static int farmerMultIter(int x, int y) {
		int sum = 0;
		while(x!=0){
			if(x%2 == 1) sum+=y;
			x/=2;
			y*=2;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(farmerMultRek(15, 22));
		System.out.println(farmerMultIter(15, 22));
	}

}
