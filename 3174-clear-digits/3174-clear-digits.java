class Solution {
    public String clearDigits(String s) {
        Stack <Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder res = new StringBuilder();
        for(char c:stack) res.append(c);
        return res.toString();
    }
}