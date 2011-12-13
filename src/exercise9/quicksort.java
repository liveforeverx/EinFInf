package exercise9;

import java.util.Arrays;

import exercise5.Time;

public class quicksort {
    static int compares;
    static int recursion;
    static int swap;

    /*
     * Some other implementation of quicksort, that need only hulf(!!!) less compares, but something
     * 30%-60% more swaps(what less, than 50% of compares).
     * 
     * Swaps local with references(as in Java) is cheap, because of reference -> I think this implementation is
     * quickly as to have more compares of complex datastructeres. 
     * 
     * This implementation has less compares as quicksort 1 with lazy evaluation too.
     */
    
    /*
     * A Quicksort 2
     */
    public static <T extends Comparable<T>> void quickSort2(T[] a) {
        quickSort2(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort2(T[] a, int l, int r) {
        recursion++;
        compares++;
        if (l < r) {
            int q = partion(a, l, r);
            quickSort2(a, l, q - 1);
            quickSort2(a, q, r);
        }
    }

    private static <T extends Comparable<T>> int partion(T[] a, int l, int r) {
        T pivot = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            compares++;
            if (a[j].compareTo(pivot) <= 0) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    private static <T extends Comparable<T>> void swap(T[] a, int first,
            int second) {
        swap++;
        T temp;
        temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
    
    /*
     * A Quicksort 1
     */
    
    public static <T extends Comparable<T>> void quickSort(T[] a) {
        quickSort(a, 0, a.length - 1);
    }
    
    private static <T extends Comparable<T>> void quickSort(T[] a, int l, int r) {
        recursion++;
        compares++;
        if (l < r) {
            int q = partition(a, l, r);
            quickSort(a, l, q - 1);
            quickSort(a, q, r);
        }
    }

    
    static <T extends Comparable<T>> int partition(T[] a, int l, int r) {
        assert (l <= r);
        T p = a[r], t = null;
        int i = l, j = r - 1;
        do {
            compares++;
            while (a[i].compareTo(p) < 0) { compares++; ++i; }
            while (j>0 && a[j].compareTo(p) > 0) { compares+=2;  --j; }
            compares+=2;
            swap++;
            t = a [ i ]; a [ i ]= a [ j ]; a [ j ]= t ;
          compares++;
        } while (i < j);
        swap++;
        a[j] = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }

    public static void start(){
        compares = 0;
        recursion = 0;
        swap = 0;
    }
    
    public static void print(){
        System.out.println("compares = " + compares);
        System.out.println("rekursion = " + recursion);
        System.out.println("swap = " + swap);
        
    }
    // Small benchmark with compares, recursion(==) and swaps
    public static void main(String[] args) {
        Time[] a = new Time[20];
        a[0] = new Time(0, 0);
        for (int i = 1; i < a.length; i++)
            a[i] = new Time((int) (24 * Math.random()),
                    (int) (60 * Math.random()));
        //System.out.println(Arrays.toString(a));
        Time[] b = a.clone();
        start();
        quickSort(a);
        print();
        start();
        //System.out.println(Arrays.toString(b));
        quickSort2(b);
        print();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
