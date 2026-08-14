class Solution {
    Set<List<Integer>> s = new HashSet<>();

    void dfs(List<Integer> cur, int[] nums, int i)
    {
        List<Integer> candidate = new ArrayList<>(cur);
        candidate.sort(Comparator.comparingInt((Integer x) -> x));
        s.add(candidate);
        if(i >= nums.length) return;
        cur.add(nums[i]);
        dfs(cur, nums, i + 1);
        cur.remove(cur.size() - 1);
        dfs(cur, nums, i + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        dfs(new ArrayList<>(), nums, 0);
        
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> l: s)
        {
            result.add(l);
        }

        return result;
    }
}
