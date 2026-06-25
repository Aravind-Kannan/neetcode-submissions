class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str: strs)
        {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        for(int i = 0; i < str.length(); i++)
        {
            StringBuilder strlen = new StringBuilder();
            while(str.charAt(i) != '#')
            {
                strlen.append(str.charAt(i)); i++;
            } 
            i++;
            int n = Integer.parseInt(strlen.toString());
            
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < n + i; j++)
            {
                sb.append(str.charAt(j));
            }
            strs.add(sb.toString());

            i = i + n - 1;
        }

        return strs;
    }
}
