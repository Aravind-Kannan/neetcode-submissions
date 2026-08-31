class KthLargest {
    PriorityQueue<Integer> maxHeap = null;
    int k = 0;

    public KthLargest(int k, int[] nums) {
        this.maxHeap = new PriorityQueue<>();
        for(int num: nums)
        {
            this.maxHeap.offer(num);
            if(this.maxHeap.size() > k)
            {
                this.maxHeap.poll();
            }
        }
        this.k = k;
    }
    
    public int add(int val) {
        this.maxHeap.offer(val);
        if(this.maxHeap.size() > this.k)
        {
            this.maxHeap.poll();
        }
        return maxHeap.peek().intValue();
    }
}
