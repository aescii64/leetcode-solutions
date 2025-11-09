import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        // new array object to hold the original items in the array
        List<Integer> originalList = new ArrayList<>();

        // make a new arraylist based off the nums array
        for (int num : nums) { // for each int called num in the nums data collection
            originalList.add(num); // add it to the originalList arraylist created
        }

        // loop the original list and find and store the min/max values
        int max = Integer.MIN_VALUE; // opposites because MIN/MAX return 2bil #, you'll just loop forever
        int min = Integer.MAX_VALUE; // when loopint through array the first small number will become the new min ans establish the proper range
        for (int value : originalList) {
            // set min/max values
            if (value < min) min = value;
            if (value > max) max = value;
        }

        // make an empty list
        ArrayList<Integer> missingElements = new ArrayList<>();

        // loop through the range, increment to find the numbers in between
        for (int i = min; i < max; i++) {
            // if the original list doesnt contain an element in the range
            if (!originalList.contains(i)) {
                // add it to the missing elements array
                missingElements.add(i);
            }
        }
        System.out.println("Missing Elements: " + missingElements);

        // if youre not missing anything, return an empty array
        if (missingElements.isEmpty()){
            return new ArrayList<>();
        }

        return missingElements;
    }

    // testing
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {5,1};
        List<Integer> missingElements = s.findMissingElements(nums);
        System.out.println("Missing Elements: " + missingElements); // return [2,3,4]
    }

}