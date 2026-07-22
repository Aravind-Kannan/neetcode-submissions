class Solution {
    int getMax(int[] freq)
    {
        int max = 0;
        for(int i = 0; i < freq.length; i++)
        {
            max = Math.max(max, freq[i]);
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int result = 0, l = 0, r = 0;

        while(r < s.length())
        {
            freq[s.charAt(r) - 'A']++;

            while(r - l + 1 - getMax(freq) > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            result = Math.max(result, r - l + 1);

            r++;
        }

        return result;
    }
}
