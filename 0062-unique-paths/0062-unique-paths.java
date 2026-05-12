class Solution {
    public int uniquePaths(int m, int n) {

        int [][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = findnOfways(0, 0, m, n, dp);
        return ans;
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