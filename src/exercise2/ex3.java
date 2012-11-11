package exercise2;

public class ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    System.out.println(tr(413, 2));
	}

	public static String tr(int dez, int basis){
		String NewString = new String();
		for( ; dez != 0; dez /= basis)
		{
			NewString = getChar(dez % basis) + NewString;
		}
		return NewString;	
	}
	
	public static char getChar(int i){
		return (i > 9) ? (char)(87 + i) : (char)(48 + i);
	}
}