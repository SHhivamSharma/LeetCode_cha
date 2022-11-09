///901. Online Stock Span

class StockSpanner {

 	List<Integer> list = new ArrayList<>();
	
     Stack<Integer> stack= new Stack<>();
	
     int count=0;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        
        count++;
        int res=0;
		
         while(!stack.isEmpty() && list.get(stack.peek()) <= price)
            stack.pop();
        
        if(!stack.isEmpty())
            res=count-stack.peek()-1;
        else  
            res=count;
			
         stack.push(list.size());
         list.add(price);
        
        return res;
    }
}

 