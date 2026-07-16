class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int stone: stones)
        {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() >= 2)
        {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(y - x > 0)
            {
                maxHeap.offer(y - x);
            }
        }

        return maxHeap.size() == 0 ? 0 : maxHeap.poll();
    }
}
