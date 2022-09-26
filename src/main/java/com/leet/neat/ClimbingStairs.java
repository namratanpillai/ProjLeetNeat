package com.leet.neat;

public class ClimbingStairs {



































































    public int climbStairs(int n) {
        int dp[] = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }

        int cal = calculateWays(n, dp);
        return cal;
    }

    private int calculateWays(int n, int dp[]) {
        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n < 2)
            return 0;
        int cal = calculateWays(n - 1, dp) + calculateWays(n - 2, dp);
        dp[n] = cal;
        return cal;

    }
}
