class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        long sum = 0;
        long maxsum = 0;
        int left = 0;

        // First window
        for (int right = 0; right < k; right++) {
            sum += nums[right];
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);
        }

        if (mp.size() == k) {
            maxsum = sum;
        }

        // Sliding window
        for (int right = k; right < nums.length; right++) {

            sum += nums[right] - nums[left];

            // Add new element
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            // Remove left element frequency
            mp.put(nums[left], mp.get(nums[left]) - 1);

            // Remove if frequency becomes 0
            if (mp.get(nums[left]) == 0) {
                mp.remove(nums[left]);
            }

            left++;

            // Check distinct elements
            if (mp.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}