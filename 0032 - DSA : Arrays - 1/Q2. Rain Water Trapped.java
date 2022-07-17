Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.

  
  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n = A.length;
        int sum = 0;

        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            //case 1
            if (A[left] <= A[right]) {
                if (A[left] >= leftMax) {
                    leftMax = A[left];
                } else {
                    sum += leftMax - A[left];
                }
                  left++;
            }
            //case 2
            else {
                if (A[right] >= rightMax) {
                    rightMax = A[right];
                } else {
                    sum += rightMax - A[right];
                }
                right--;
            }
        }
        return sum;

    }
}
