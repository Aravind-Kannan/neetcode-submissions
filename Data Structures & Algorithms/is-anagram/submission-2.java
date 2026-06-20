class Solution {
    void countFrequency(String s, int[] freq)
    {
        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
    }

    public boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];     
        int[] freqT = new int[26];

        countFrequency(s, freqS);
        countFrequency(t, freqT);

        for(int i = 0; i < 26; i++) {
            if(freqS[i] != freqT[i])
            {
                return false;
            }
        }

        return true;     
    }
}
