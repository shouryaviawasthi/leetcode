class Solution {
    public int majorityElement(int[] nums) {
        // Map to store: Element -> Frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        int majorityElement = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // Get the current count, increment it by 1, and put it back
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            
            // If this element's frequency is the new highest, update our trackers
            if (count > maxFreq) {
                maxFreq = count;
                majorityElement = num;
            }
        }
        
        return majorityElement;
    }
}