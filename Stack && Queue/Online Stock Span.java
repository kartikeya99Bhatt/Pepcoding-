class StockSpanner {

      Stack<Integer>st;
    static int count =0;
    HashMap<Integer,Integer>map;
    
    public StockSpanner() {
        st=new Stack<>();
        count=0;
        map=new HashMap<>();
    }
    
    public int next(int price) {
        
        count++;
        map.put(count,price);
        while(st.size()>0 && map.get(st.peek())<=price)
        {
            st.pop();
        }
        if(st.size()==0)
        {
            st.push(count);
            return (count-0);
        }
        else
        {
            int ans=count-st.peek();
             st.push(count);
            return ans;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
