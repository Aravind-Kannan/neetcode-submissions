class Solution {
    String freqString(String s)
    {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(freq);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String str: strs)
        {
            String freq = freqString(str);
            List<String> val = group.getOrDefault(freq, new ArrayList<String>());
            val.add(str);
            group.put(freq, val); 
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> g: group.values())
        {
            result.add(g);
        }

        return result;
    }
}
