class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair<Integer, Integer>> st = new Stack<>();

        int[] res = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0; i--)
        {
            while(st.size() != 0 && st.peek().getKey() <= temperatures[i])
            {
                st.pop();
            }

            if(st.size() != 0) {
                res[i] = st.peek().getValue() - i;
            }

            st.push(new Pair<>(temperatures[i], i));
        }

        return res;
    }
}
