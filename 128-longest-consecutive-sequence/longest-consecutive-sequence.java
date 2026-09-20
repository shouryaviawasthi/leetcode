class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int longest = 0;
        for(int num : set)
        {
           if(!set.contains(num-1))
           {
            int curN = num;
            int curL = 1;
            while(set.contains(curN+1))
            {
                curN++;
                curL++;
            }
            longest = Math.max(longest,curL);
           }
        }
        return longest;
    }
}