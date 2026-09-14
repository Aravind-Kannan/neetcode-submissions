class Solution {

    public String encode(List<String> strs) {
        String s = "";

        for(String str: strs)
        {
            s += str.length() + "#" + str;
        }

        return s;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;

        while(i < str.length())
        {
            String counter = "";
            while(Character.isDigit(str.charAt(i)))
            {
                counter += str.charAt(i); i++;
            }

            i++;

            int count = Integer.parseInt(counter);
            strs.add(str.substring(i, i + count));
            i += count;
        }

        return strs;
    }
}
