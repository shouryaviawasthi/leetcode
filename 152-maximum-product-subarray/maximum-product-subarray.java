class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0)
        return 0;
        
        int globalMax = nums[0];
        int prefixProd = 1, suffixProd = 1, n = nums.length;
        for(int i =0; i<n; i++)
        {
            if(prefixProd == 0) prefixProd = 1;
            if(suffixProd == 0) suffixProd = 1;
             prefixProd *= nums[i];
             suffixProd *= nums[n-1-i];

             globalMax = Math.max(globalMax, Math.max(prefixProd, suffixProd));
        }
        return globalMax;
    }
}