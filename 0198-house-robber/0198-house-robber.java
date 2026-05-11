class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        int ans = findMax(0,nums,dp);
        return ans;
    }
    int findMax(int i, int[] nums, int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        
        int include = nums[i]+findMax(i+2,nums,dp);
        int exclude = findMax(i+1,nums,dp);
        dp[i] = Math.max(include,exclude);
        return dp[i];
    }
}