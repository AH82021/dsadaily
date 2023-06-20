import java.util.Arrays;

public class Sol10 {
    /**
     In-place merge two sorted arrays


     Given two sorted arrays, X[] and Y[] of size m and n each, merge elements of X[] with elements of array Y[] by maintaining the sorted order, i.e., fill X[] with the first m smallest elements and fill Y[] with remaining elements.

     Do the conversion in-place and without using any other data structure.


     For example,

     Input:

     X[] = { 1, 4, 7, 8, 10 }
     Y[] = { 2, 3, 9 }

     Output:

     X[] = { 1, 2, 3, 4, 7 }
     Y[] = { 8, 9, 10 }
     */
    public static void merge(int[] x, int[] y) {
        int m = x.length;
        int n = y.length;
        for(int i = 0; i < m; i++) {
            int temp = x[i];
            x[i]=y[0];
            y[0] = temp;
            int first =y[0];
            int k;
            for(k = 1; k < n && y[k]<first; k++) {
                y[k-1] = y[k];
            }
            y[k-1] = first;
        }
    }
    public static void main(String[] args) {
     int[] x = { 1, 4, 7, 8, 10 };
     int[] y = { 2, 3, 9 };
     merge(x, y);
     System.out.println(Arrays.toString(x));
     System.out.println(Arrays.toString(y));
    }
}
