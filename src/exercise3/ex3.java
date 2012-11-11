package exercise3;

public class ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//public static int rek(int x, int y).
	}


	
	
	
	
	
	public static int rekfirst(int x, int y){
		if(y == 0) return x;
		else return rekfirst(x - 1, y -1);
	}

	public static int iterfirst(int x, int y){
		while(y!=0)
		{x--; y--;}
		return x;
	}
	public static int rek(int x, int y){
		if(y > 0) return rek(x - 1, y - 1);
		else if(y < 0) return rek(x + 1, y + 1);
		else return x;
	}

	public static int iter(int x, int y){
		int change;
		if(y > 0) change = -1; else change = +1;
		while(y!=0)
		{x+=change; y+=change;}
		return x;
	}

	public static int superiter(int x, int y){
		return x-y;
	}
	
}
