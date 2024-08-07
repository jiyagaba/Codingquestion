import java.util.* ;
import java.io.*; 

public class Solution {

    public static long sumOrProduct(int n, int q) {
        final int MOD = 1000000007;  // Define the modulo value

        if (q == 1) {
            
            return (long) n * (n + 1) / 2 % MOD;
        }

        long product = 1;
        if (q == 2) {
            
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
        }
        return product;
    }
}
