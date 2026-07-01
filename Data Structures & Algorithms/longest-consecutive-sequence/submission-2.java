class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int num: nums)
        {
            s.add(num);
        }

        int countLongest = 0;
        for(int num: nums)
        {
            if(!s.contains(num - 1))
            {
                int count = 0;
                while(s.contains(num))
                {
                    num = num + 1;
                    count++;
                } 
                countLongest = Math.max(countLongest, count);
            }
        }

        return countLongest;
    }
}
