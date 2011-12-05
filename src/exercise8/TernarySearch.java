package exercise8;

public class TernarySearch {

    /**
     * @param args
     */

    static int recfunctions;
    static int compares;
    static long timer;
    static final int UNDEF = -1;

    public static int find(int[] a, int x) {
        return _find(a, 0, a.length - 1, x);
    }

    private static int _find(int[] a, int l, int r, int x) {
        recfunctions++;
        compares++;
        if (l > r)
            return UNDEF;
        int m = (l + r) / 2;
        compares++;
        if (x == a[m])
            return m;
        compares++;
        if (x < a[m])
            return _find(a, l, m - 1, x);
        else
            return _find(a, m + 1, r, x);
    }

    public static int ternaryRec(int a[], int x) {
        return ternaryRec(a, 0, a.length - 1, x);
    }

    public static int ternaryRec(int a[], int l, int r, int x) {
        recfunctions++;
        compares++;
        if (l > r)
            return UNDEF;
        int way = (r - l) / 3;
        int m1 = l + way;
        int m2 = m1 + way;
        compares++;
        if (x == a[m1])
            return m1;
        compares++;
        if (x == a[m2])
            return m2;
        compares++;
        if (x < a[m1])
            return ternaryRec(a, l, m1 - 1, x);
        compares++;
        if (x < a[m2])
            return ternaryRec(a, m1 + 1, m2 - 1, x);
        else
            return ternaryRec(a, m2 + 1, r, x);
    }

    public static void print(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
    public static void start(){
        recfunctions = 0;
        compares = 0;
        timer = System.currentTimeMillis();
    }
    public static void print(){
        timer = System.currentTimeMillis() - timer;
        System.out.println("Time: " + timer);
        System.out.println("Deep: " + recfunctions);
        System.out.println("Compares: " + compares);
    }
    
    public static void main(String[] args) {
        int[] array = new int[18000];
        int t = 0;
        for(int i=0; i<array.length; i++) {
            t += 2 + (int)(5*Math.random());
            array[i] = t;
        }
        print(array);
        start();
        System.out.println(ternaryRec(array, 500));
        print();
        start();
        System.out.println(find(array, 500));
        print();
        
    }

}
