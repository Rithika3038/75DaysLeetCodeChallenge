class StockSpanner {

    Stack<Integer> pricestack = new Stack<>();
    Stack<Integer> spanstack = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        
        int span = 1;
        while(!pricestack.isEmpty() && pricestack.peek() <= price){
            span = span + spanstack.peek();
            pricestack.pop();
            spanstack.pop();
        }
        pricestack.push(price);
        spanstack.push(span);

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */