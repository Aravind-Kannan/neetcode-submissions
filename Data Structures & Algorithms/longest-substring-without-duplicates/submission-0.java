class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, n = s.length(), count = 0;
        Set<Character> set = new HashSet<>();

        while(r < n)
        {
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l)); l++;
            }
            set.add(s.charAt(r));
            count = Math.max(count, r - l + 1);
            r++;
        }

        return count;
    }
}
