class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
        {
            return false;
        }

        int[] freqS1 = new int[26];
        for(int i = 0; i < s1.length(); i++)
        {
            freqS1[s1.charAt(i) - 'a']++;
        }
        String freqS1Str = Arrays.toString(freqS1);
        
        int[] freqS2 = new int[26];
        int l = 0, r = 0;
        for(; r < s1.length(); r++)
        {
            freqS2[s2.charAt(r) - 'a']++;
        }

        while(r < s2.length())
        {
            if(Arrays.toString(freqS2).equals(freqS1Str))
            {
                return true;
            }
            freqS2[s2.charAt(l) - 'a']--;
            freqS2[s2.charAt(r) - 'a']++;
            l++;
            r++;
        }

        return Arrays.toString(freqS2).equals(freqS1Str);
    }
}
