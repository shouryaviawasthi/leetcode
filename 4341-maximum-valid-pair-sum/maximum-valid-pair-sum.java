class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxS = Integer.MIN_VALUE;
        int prefixMax = nums[0];
        for(int j=k;j<nums.length;j++)
        {
            prefixMax = Math.max(prefixMax, nums[j-k]);
            maxS = Math.max(maxS,prefixMax + nums[j]);
        }
        return maxS;
    }
}