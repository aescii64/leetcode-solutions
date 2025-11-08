public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // take array of numbers and find indices of which equals target sum

        // i starts at 0 and count up the length of the array
        for (int i = 0; i < nums.length; i++) { // find index 1
            // j starts at the next number after i and continues up the length of the array
            for (int j = i + 1; j < nums.length; j++){ // find index 2

                if (nums[i] + nums[j] == target) { // if the number at the index adds up to the target
                    return new int[] {i, j}; // print the 2 indices as an array
                }

            }
        }

        return new int[0];// if you dont find any valid indices return 0;
    }

    // testing
    public static void main(String[] args) {
        Solution a = new Solution();


        int[] nums = {3, 2, 4};
        int target = 6;
        int[] sum = a.twoSum(nums, target);

        if (sum.length == 2) {
            System.out.println("[" + sum[0] + ", " + sum[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }

    }
}
