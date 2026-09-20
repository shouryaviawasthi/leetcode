class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int posI = 0;
        int negI = 1;
        for(int num : nums)
        {
            if(num>0)
            {
                res[posI] = num;
                posI+=2;
            }
            else
            {
                res[negI] = num;
                negI+=2;
            }
        }
        return res;
    }
}