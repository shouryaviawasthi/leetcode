class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;  // Largest element
        long second = Long.MIN_VALUE; // Second largest element
        long third = Long.MIN_VALUE;  // Third largest element

        for (int num : nums) {

            // Duplicate elements skip karo
            if (num == first || num == second || num == third) {
                continue;
            }

            // Agar current number largest hai
            if (num > first) {
                third = second;
                second = first;
                first = num;

            // Agar current number second largest hai
            } else if (num > second) {
                third = second;
                second = num;

            // Agar current number third largest hai
            } else if (num > third) {
                third = num;
            }
        }

        // Agar third distinct maximum exist karta hai
        if (third != Long.MIN_VALUE) {
            return (int) third;
        }

        // Otherwise, largest element return karo
        return (int) first;
    }
}