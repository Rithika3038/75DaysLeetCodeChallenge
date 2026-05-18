class Solution {
    public int findTheWinner(int n, int k) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i=1; i<=n ;i++){
            q.addLast(i);
        }
        while(q.size() > 1){
            for(int count=1; count<k; count++){
                q.addLast(q.peekFirst());
                q.removeFirst();
            }
            q.removeFirst();
        }
        return q.peekFirst();
    }
}