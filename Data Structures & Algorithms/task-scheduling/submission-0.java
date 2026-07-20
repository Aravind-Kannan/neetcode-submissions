class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task: tasks) 
        {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: freq)
        {
            if(i > 0) maxHeap.offer(i);
        }

        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        int time = 0;

        while(maxHeap.size() > 0 || q.size() > 0)
        {
            time++;
            if(maxHeap.size() > 0)
            {
                int top = maxHeap.poll();
                if(top - 1 > 0)
                q.offer(new Pair<>(time + n, top - 1));
            }
            
            while(q.size() > 0 && q.peek().getKey() == time)
            {
                maxHeap.offer(q.poll().getValue());
            }
        }

        return time;
    }
}
