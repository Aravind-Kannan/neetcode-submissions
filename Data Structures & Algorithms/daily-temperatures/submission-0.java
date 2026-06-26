class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Pair<Integer,Integer>> s = new Stack();

        for(int i = n - 1; i >= 0; i--)
        {
            int curTemp = temperatures[i];
            while(!s.isEmpty() && s.peek().getKey() <= curTemp)
            {
                s.pop();
            }
            if(!s.isEmpty())
            {
                result[i] = s.peek().getValue() - i;
            }
            if(s.isEmpty() || s.peek().getKey() > curTemp)
            {
                s.push(new Pair<>(curTemp, i));
            }
        }

        return result;
    }
}
