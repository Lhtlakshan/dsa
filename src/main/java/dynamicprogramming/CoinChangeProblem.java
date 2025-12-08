package dynamicprogramming;

import java.util.Arrays;

public class CoinChangeProblem {

    // minimum coins(from given) need for the relevant weight (value of money)
    public static int minCoins(int[] coins, int W) {
        int[] dp = new int[W + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int w = 1; w <= W; w++) {
            for (int coin : coins) {
                if (coin <= w && dp[w - coin] != Integer.MAX_VALUE) {
                    dp[w] = Math.min(dp[w], dp[w - coin] + 1);
                }
            }
        }

        return dp[W] == Integer.MAX_VALUE ? -1 : dp[W];
    }

}
