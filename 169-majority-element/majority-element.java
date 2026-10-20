class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        int majorityElement = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxFreq) {
                maxFreq = count;
                majorityElement = num;
            }
        }
        
        return majorityElement;
    }
}