class Solution {                                    // 234  
    public int subtractProductAndSum(int n) {
        int product = 1;                            // Creating a box called product where it starts at 1 (b/c multiply by 1 doesn't change anything) to keepp track of multiplication
        int sum = 0;                                // Creating a box called sum where it starts at 0 (b/c adding 0 deosn't change anything) to keep track of addition

        while (n > 0) {                             // Loop that repeats code as long as n > 0, "keep going until we run out of digits ex n = 234, we will process one digit at a time." loop tops at n = 0
            int digit = n % 10;                     // this line gets the last digit of the number. (Gives remainder after deviding). Ex: 234 % 10 gives 4, 23 % 10 gives 3 and 2 % 10 gives 2.
            product = product * digit;              // This multiplies the current digit into the total product. Example: first product = 1 * 4 = 4, then 4 * 3 = 12, then 12 * 2 = 24
            sum = sum + digit;                      // This adds the current digit to the total sum. Example: 0 + 4 = 4, then 4 + 3 = 7, then 7 + 2 = 9
            n = n/10;                               // This removes the last digit from n. (dividing (/) integers drops the decimal) 
        }
        return product - sum;
    }
} 
