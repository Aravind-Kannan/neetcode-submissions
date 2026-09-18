class Solution {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] post = new int[height.length];

        pre[0] = height[0];
        post[height.length - 1] = height[height.length - 1];

        for(int i = 1; i < height.length; i++)
        {
            pre[i] = Math.max(pre[i - 1], height[i]);
        }

        for(int i = height.length - 2; i >= 0; i--)
        {
            post[i] = Math.max(post[i + 1], height[i]);
        }

        int water = 0;

        for(int i = 0; i < height.length; i++)
        {
            water += Math.min(pre[i], post[i]) - height[i];
        }

        return water;
    }
}
