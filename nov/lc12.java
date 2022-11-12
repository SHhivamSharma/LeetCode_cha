////295. Find Median from Data Stream


class MedianFinder {
    private PriorityQueue<Integer> leftPQ = 
        new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> rightPQ = new PriorityQueue<>();
     
     public void addNum(int num) {
        if (leftPQ.isEmpty() || num <= leftPQ.peek()) {
            leftPQ.offer(num);
        } else {
            rightPQ.offer(num);
        }
         
         if (leftPQ.size() - rightPQ.size() > 1) {
            rightPQ.offer(leftPQ.poll());
        } else if (rightPQ.size() - leftPQ.size() > 1) {
            leftPQ.offer(rightPQ.poll());
        }
    }
 
     public double findMedian() {
       
        if(leftPQ.isEmpty()) {
            return (double) rightPQ.peek();
        } else if (rightPQ.isEmpty()) {
            return (double) leftPQ.peek();
        } else if (leftPQ.size() > rightPQ.size()) {
            return (double) leftPQ.peek();
        } else if (rightPQ.size() > leftPQ.size()) {
            return (double) rightPQ.peek();
        } else {
            return (double) (leftPQ.peek() + rightPQ.peek()) / 2;
        }
    }
};
