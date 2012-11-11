package exercise4;

import java.util.Arrays;

public class Food implements Comparable<Food> {
    private String type;
    private int calories;
    private static String[] TYPES = {"Apple", "Pear", "Cookie"};

    public static void main(String[] args) {
        // TODO your test cases
    	print(createSortedRandomList(10));
    }
    
    public Food(String type, int calories) {
    	this.type = type;
    	this.calories = calories;
    }

    public int compareTo(Food o) {
        if ( this == o ) return 0;
        if ((this.type.length() * this.calories) > (o.type.length() * o.calories) ) return 1;
        else return -1;
    }
    
   
    public static Food[] createSortedRandomList(int n) {
        // TODO create a list with n random instances and sort them
    	Food[] food = new Food[n];
    	for(int i=0; i<food.length; i++){
    		food[i] = new Food(TYPES[(int)(2.0*Math.random())], (int)(60 * Math.random()));
    	}
    	java.util.Arrays.sort(food);
    	return food;
    	
    }

	@Override
	public String toString() {
		return "Food [type=" + type + ", calories=" + calories + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public static void print(Food[] a){
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].toString());
		}
		System.out.println();
	}
}