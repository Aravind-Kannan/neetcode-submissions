class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int[] result = new int[2];

        while(l < r && r < numbers.length && l >= 0)
        {
            if(numbers[l] + numbers[r] == target)
            {
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            }
            else if(numbers[l] + numbers[r] > target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }

        return result;
    }
}
