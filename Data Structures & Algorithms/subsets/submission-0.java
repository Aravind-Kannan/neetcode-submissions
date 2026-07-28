class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    void f(int i, int n, List<Integer> curr, int[] nums)
    {
        if(i == n) {
            result.add(new ArrayList<>(curr));
            return;
        }

        f(i + 1, n, new ArrayList<>(curr), nums);
        curr.add(nums[i]);
        f(i + 1, n, new ArrayList<>(curr), nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        f(0, nums.length, new ArrayList<Integer>(), nums);
        return result;
    }
}
