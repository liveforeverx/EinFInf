package exercise11;

public class BinIntComparator implements IntegerComparator {

    @Override
    public boolean isLessThan(Integer o1, Integer o2) {
        int i1 = o1.intValue();
        int i2 = o2.intValue();
        if(getNumberOfOnes(i1) < getNumberOfOnes(i2)) return true;
        return false;
    }
    
    private int getNumberOfOnes(int x){
        int counter = 0;
        for( ; x!=0 ; x/=2){
            if(x%2==1)counter++;
        }
        return counter;
    }
    
    public static void main(String[] args) {
        BinIntComparator x = new BinIntComparator();
        System.out.println(x.isLessThan(7, 8));
    }

}
