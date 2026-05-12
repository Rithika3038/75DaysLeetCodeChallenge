class Solution {
    public int uniquePaths(int m, int n) {

        int [][] dp = new int[m+1][n+1];

        dp[m-1][n-1] = 1;
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 && j==n-1){
                    continue;
                }
                dp[i][j] = dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
        //int ans = findnOfways(0, 0, m, n, dp);
        //return ans;
    }
    int findnOfways(int i, int j, int m, int n, int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m-1 || j>n-1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int dir1 = findnOfways(i, j+1, m, n, dp);
        int dir2 = findnOfways(i+1, j, m, n, dp);

        dp[i][j] = dir1+dir2;
        return dp[i][j];
    }
}