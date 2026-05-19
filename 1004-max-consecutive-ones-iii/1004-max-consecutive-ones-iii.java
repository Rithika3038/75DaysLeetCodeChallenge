class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxLength = 0;
        int left = 0;
        int count = 0;
        
        //expanding the window process till I cisit k+1 zero

        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0){
                count++;
            }
            //count has become greater shinnk till the window has become valid
            while(count > k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}