import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sol12 {
    /**
     * Find all distinct combinations of a given length – I
     * Given an integer array, find all distinct combinations of a given length k.
     * For example,
     * Input:  {2, 3, 4}, k = 2
     * Output: {2, 3}, {2, 4}, {3, 4}

     * Input:  {1, 2, 1}, k = 2
     * Output: {1, 2}, {1, 1}, {2, 1}
     * The program should print all the distinct combinations, while preserving the relative order of elements as they appear in the array.
     */
    // Function to print all distinct combinations of length `k`
    public static void findCombinations(int[] A, int i, int k,
                                        Set<List<Integer>> subarrays,
                                        List<Integer> out)
    {
        // invalid input
        if (A.length == 0 || k > A.length) {
            return;
        }

        // base case: combination size is `k`
        if (k == 0) {
            subarrays.add(new ArrayList<>(out));
            return;
        }

        // start from the next index till the last index
        for (int j = i; j < A.length; j++)
        {
            // add current element `A[j]` to the solution and recur for next index
            // `j+1` with one less element `k-1`
            out.add(A[j]);
            findCombinations(A, j + 1, k - 1, subarrays, out);
            out.remove(out.size() - 1);        // backtrack
        }
    }

    public static Set<List<Integer>> findCombinations(int[] A, int k)
    {
        Set<List<Integer>> subarrays = new HashSet<>();
        findCombinations(A, 0, k, subarrays, new ArrayList<>());
        return subarrays;
    }

    public static void main(String[] args)
    {

        int[] A = { 1, 2, 3,4 };
        int k = 3;
        // process elements from left to right
        System.out.println(findCombinations(A, k));
    }
}
