import java.util.ArrayList;
import java.util.List;

public class Solution {


    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int[] remainder = new int[k];
        for (int i = 0; i < s.size(); i++) {
            int temp = s.get(i) % k;
            remainder[temp] = remainder[temp] + 1;
        }
        if (k % 2 == 0) {
            remainder[k / 2] = 1;
        }
        if (remainder[0] > 0) {
            remainder[0] = 1;
        }

        int max = remainder[0];
        for (int j = 1; j <= k / 2; j++) {
            max = max + Math.max(remainder[j], remainder[k - j]);


        }

        return max;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(
                List.of(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436));


        System.out.println(nonDivisibleSubset(7, arr));
    }
}
