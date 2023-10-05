class MedianFinder {

    List<Integer> list;

    public MedianFinder() {

        this.list=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        
        if(list.size() == 0) list.add(0,num);
        else{
            int i=0;
            while(list.get(i) <=num && i<list.size()-1) i++;

            if(list.get(i) <=num) list.add(i+1,num);
            else list.add(i,num);
        }
    }
    
    public double findMedian() {
        
        int n=list.size();
        if(n==0) return 0;
        if(n%2 == 1){
            return list.get(n/2);
        }

        return (double) ((list.get(n/2) + list.get(n/2 - 1)))/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
