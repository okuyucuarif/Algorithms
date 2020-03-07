import java.math.BigInteger;
/*  Click the below link to learn BigInteger Library.
 *    https://www.geeksforgeeks.org/biginteger-multiply-method-in-java-with-examples/
 *
 */

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        BigInteger mult = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        System.out.println(mult);


    }

}
