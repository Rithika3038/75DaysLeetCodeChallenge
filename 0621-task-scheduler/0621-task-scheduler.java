class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c:tasks){
            count[c - 'A']++;
        }
        java.util.Arrays.sort(count);
        int max = count[25]-1;
        int idle = max*n;
        for(int i=24; i>=0; i--){
            idle -= Math.min(count[i], max);
        }
        if(idle>0){
            return tasks.length+idle;
        }
        return tasks.length;
    }
}