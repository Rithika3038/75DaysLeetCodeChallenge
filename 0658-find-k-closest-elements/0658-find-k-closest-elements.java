class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        //I have to remove elements till j-i+1
        while (j-i+1 > k){
            if(x-arr[i] > arr[j]-x){
                i++;
            }
            else{
                j--;
            }
        }
        //push all the elements from i to j in ans
    for(int index =i; index<=j; index++){
        ans.add(arr[index]);
    }
    return ans;
    }
}