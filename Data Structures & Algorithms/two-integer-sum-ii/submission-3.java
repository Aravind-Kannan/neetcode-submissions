class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++)
        {
                int key = target - numbers[i];

                int l = 0, r = numbers.length - 1;

                while(l <= r)
                {
                    int mid = (l + r)/2;
                    if(numbers[mid] == key && mid != i) {
                        return new int[]{Math.min(i, mid) + 1, Math.max(i, mid) + 1};
                    }
                    else if(numbers[mid] < key)
                    {
                        l = mid + 1;
                    }
                    else
                    {
                        r = mid - 1;
                    }
                }
            
        }

        return new int[]{};
    }
}
