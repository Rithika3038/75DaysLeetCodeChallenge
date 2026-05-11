class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = findnumberOfways(0,n,dp);
        return ans;
    }
    public int findnumberOfways(int i, int n, int[] dp){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int n1 = findnumberOfways(i+1,n,dp);
        int n2 = findnumberOfways(i+2,n,dp);
        dp[i] = n1 + n2;
        return dp[i];
    }
}