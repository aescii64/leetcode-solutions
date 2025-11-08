public class Solution {
<<<<<<< HEAD
    public boolean isPalindrome(int x) {

        // check if number is palindrome
        // turn the number into a string "121" save as original string
        // use reverse() to reverse number order
        // if reverse number == original return true
        // else false


        String originalString = Integer.toString(x);
        // use stringBuilder to save and reverse
        StringBuilder original = new StringBuilder(originalString);
        original.reverse();
        // reverse back
        String backToOriginal = original.toString();
        //compare the re-reversed string to the true original string in string builder
         if (backToOriginal.equals(originalString)) {
             return true;
         } else {
             return false;
         }
=======
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
>>>>>>> da25dad52509dd2e57cf5a7ade4178ebe88dde53
    }

    // testing
    public static void main(String[] args) {
<<<<<<< HEAD
        Solution s = new Solution();
        int x = 626;

        boolean result = s.isPalindrome(626);
        //System.out.println(s.);
        System.out.println("Result = " + result); // return true
=======
        Solution a = new Solution();


        int[] nums = {3, 2, 4};
        int target = 6;
        int[] sum = a.twoSum(nums, target);

        if (sum.length == 2) {
            System.out.println("[" + sum[0] + ", " + sum[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }

>>>>>>> da25dad52509dd2e57cf5a7ade4178ebe88dde53
    }
}
