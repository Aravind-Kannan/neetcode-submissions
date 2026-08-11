class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>(Comparator.comparingInt((Pair<Integer, Integer> x) -> x.getKey()).reversed().thenComparingInt(x -> x.getValue()));

        for(Map.Entry<Integer, Integer> kv: freq.entrySet())
        {
            maxHeap.offer(new Pair(kv.getValue(), kv.getKey()));
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++)
        {
            result[i] = maxHeap.poll().getValue();
        }
        
        return result;
    }
}
