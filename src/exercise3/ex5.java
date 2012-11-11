package exercise3;

public class ex5 {

	   public static int f(int x) {   
		   if(x>100) return x-10;
		   else return f(f(x+11));
	   } 

	   public static int g(int x) {
		   if(x==1) return 1;
		   else return g(h(x));
	   } 

		   private static int h(int x) {
			   System.out.println("h: input: " + x);
			   if(x%2==0) return x / 2;
	              else return 3*x+1;
		   }
		  
		   public static void main(String[] args) {
		   System.out.println(f(1000));
		   System.out.println(f(100));
		   System.out.println(f(-106));
		   System.out.println(g(1));
		   System.out.println(g(100));
		   }
		}
