class StockSpanner {
    Stack<Integer> s;
    List<Integer> a;
    public StockSpanner() {
        s = new Stack<>();
        a = new ArrayList<Integer>();
    }
    
    public int next(int price) {
        if(s.isEmpty()){
            s.push(0);
            a.add(price);
            return 1;
        }else{
            if(price<a.get(s.peek())){
                a.add(price);
                s.push(a.size()-1);
                return 1;
            }else{
                a.add(price);
                while((!s.isEmpty())&&(a.get(s.peek())<=price)){
                    s.pop();
                }
                if(s.isEmpty()){
                    s.push(a.size()-1);
                    System.out.print(a.size());
                    return a.size();
                }else{
                    int x=0;
                    try{
                        x= s.peek();
                    }catch(Exception e){
                        System.out.print(e);
                    }
                    
                    System.out.print(x);
                    s.push(a.size()-1);
                    return a.size()-x-1;                    
                }

            }
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
