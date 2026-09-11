class Solution {
    String freqToString(String s)
    {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(freq);
    }

    public boolean isAnagram(String s, String t) {
        return freqToString(s).equals(freqToString(t));
    }
}
