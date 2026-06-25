class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(int i = 0; i < strs.length; i++) 
        {
            String str = strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            List<String> groupsValue = groups.getOrDefault(sortedStr, new ArrayList<String>());
            groupsValue.add(str);
            groups.put(sortedStr, groupsValue);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> groupsValue: groups.values())
        {
            result.add(groupsValue);
        }

        return result;
    }
}
