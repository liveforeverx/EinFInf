package exercise9;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    static class CUPString implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
        
    }

    static class CDOWNString implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
    
    public static <T> void msort(T[] a, T[] copy, int l, int r, Comparator<T> c) {
        int i, j, k;
        if (r > l) {
            int mid = (r + l) / 2;

            msort(a, copy, l, mid, c);
            msort(a, copy, mid + 1, r, c);

            for (i = mid + 1; i > l; i--)
                copy[i - 1] = a[i - 1];
            for (j = mid; j < r; j++)
                copy[r + mid - j] = a[j + 1];

            for (k = l; k <= r; k++)
                if (c.compare(copy[i], copy[j]) < 0)
                    a[k] = copy[i++];
                else
                    a[k] = copy[j--];
        }
    }

    public static <T> void mergeSort(T[] a, Comparator<T> c) {
        msort(a, a.clone(), 0, a.length - 1, c);
    }
    
    public static void main(String[] args) {
        String[] array = {"abcd", "fghjd", "hgjkd", "tzujg", "dfgss", "afglkddhh"};
        mergeSort(array, new CUPString());
        System.out.println(Arrays.toString(array));
        mergeSort(array, new CDOWNString());
        System.out.println(Arrays.toString(array));
    }
        
}
