class KthLargest {
    PriorityQueue<Integer> minHeap = null;
    int size = 0; 

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        size = k;
        for(int i = 0; i < nums.length; i++)
        {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(minHeap.size() == size && minHeap.peek() <= val)
        {
            minHeap.poll();
        }
        if(minHeap.size() < size || minHeap.peek() <= val)
        {
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
