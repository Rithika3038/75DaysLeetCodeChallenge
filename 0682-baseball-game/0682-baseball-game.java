class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        for(String ch: operations){
            if(ch.equals("C"))
                stack.pop();
            else if(ch.equals("D"))
                stack.push(2*stack.peek());
            else if(ch.equals("+")){
                int last = stack.pop();
                int n = last+stack.peek();
                stack.push(last);
                stack.push(n);
            }
            else
                stack.push(Integer.parseInt(ch));
        }
        int sum = 0;
        for(int score : stack)
            sum = sum + score;
        return sum;
    }
}