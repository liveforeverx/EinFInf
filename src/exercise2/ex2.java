package exercise2;

public class ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(21));
		System.out.println(isPalindrome(241));
		System.out.println(isPalindrome(219));
		System.out.println(isPalindrome(21991));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(22));
		System.out.println(isPalindrome(9779));
		System.out.println(numDigits(2011));
	}

	public static int numDigits(int n){
		int a = 1;
		while(n / 10 != 0){
			n /= 10;
			a++;
		}
		return a;
	}
	
	public static int getDigit(int n, int index){
		int length = numDigits(n);
		index = --length - index;
		for(int i = 0; i < index; i++)
		{
			n /= 10;
		}
		return n%10;
	}
	
	public static boolean isPalindrome(int n){
		int length = numDigits(n);
		length--;
		boolean result = true;
		for(int i = 0; i <= length/2; i++){
			if(getDigit(n, i) != getDigit(n, length-i)) result = false;
		}
		return result;
	}	
}
