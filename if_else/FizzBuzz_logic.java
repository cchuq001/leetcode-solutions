// Problem: https://leetcode.com/problems/fizz-buzz/description/?envType=problem-list-v2&envId=2nq9h837
// Language: Java

class Solution {
    public List<String> fizzBuzz(int n) { 
        List<String> result = new ArrayList<>();// Your declaring a variable named result. It's of type List<String> - a generic Decleration for a list of String objects 
                                                // Created a new object called ArrayList<String>, giving result a working list it can store strings in. This is called Intantiation.

        for (int i = 1; i <= n; i++) {          // Loops from 1 to n
            if (i % 15 == 0) {                  // Checks if the number is divisible by both 3 and 5, if so only the first if triggers b/c of the else if structure 
                result.add("FizzBuzz");         // "Fizz" is added, and the "Buzz" block is skipped
            }
            else if (i % 3  == 0) {             // If i is divisible by 3, it adds "Fizz" to the result
                result.add("Fizz");
            }
            else if (i % 5 == 0) {              // If i is not divisible by 3, but divisible by 5, it adds "Buzz"
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(i));  // Converts the integer i into a string
            }
        }
        return result;
    }
}
