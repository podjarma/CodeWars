package CodeWars.Kyu5.NumberOfTrailingZerosOfN;

import static org.junit.Assert.assertThat;

public class Solution {
    public static int zeros(int n) {
        int res = 0;
        while (n > 0)
        {
            n /= 5;
            res += n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Solution.zeros(0));
        System.out.println(Solution.zeros(6));
        System.out.println(Solution.zeros(32));
    }
}