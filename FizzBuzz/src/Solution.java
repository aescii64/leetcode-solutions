import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {

        // make a new empty list to hold the answer
        List<String> answer = new ArrayList<>();

        // loop through all elements
        for (int i = 1; i <= n; i++) {

            // mod 15 condition
             if (i % 15 == 0) {
                answer.add("FizzBuzz");
            }

             // mod 5 condition
             else if (i % 5 == 0) {
                 answer.add("Buzz");
             }


            // mod 3 condition
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }

            else {
                answer.add(String.valueOf(i));
             }






           // System.out.println(answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution a = new Solution();

        System.out.println(a.fizzBuzz(3)); // return [1, 2, Fizz]
    }
}
