class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for(int num: nums) {
            h.add(num);
        }

        for(int i = 0; i <= nums.length; i++) {
            if(!h.contains(i)) return i;
        }

        return -1;
    }
}
