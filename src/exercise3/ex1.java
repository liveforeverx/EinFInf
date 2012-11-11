package exercise3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] pairs = amicablePairs(n);
		print(pairs);
	}
	
	public static int[][] amicablePairs(int n){
		int[][] pairs = new int[n][2];
		int sum = 0;
		int numbers = 0;
		for(int i=2; numbers < n; i++)
		{
			sum = sumT(i);
			if(i == sumT(sum) && sum!=i)
			{
				pairs[numbers][0] = i;
				pairs[numbers++][1] = sum;
				i = sum;
			}
		}
		return pairs;
	}
	
// sum
	public static int sumT(int n){
		int sum = 0;
		for(int i = 1; i<=n / 2; i++)
		{ 
			//sum += ((digit % i==0) ? i : 0 );
			if(n % i == 0)sum = sum + i;
		}
	    return sum;
	}
	
	public static void print(int[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
