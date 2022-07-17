Given an array of integers A and an integer B. Find and return the maximum value of | s1 - s2 |

where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of elemets of s1

Note |x| denotes the absolute value of x.


Input Format

The arguments given are the integer array A and integer B.
Output Format

Return the maximum value of | s1 - s2 |.
Constraints

1 <= B < length of the array <= 100000
1 <= A[i] <= 10^5 
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 2
Output 1:
    9

Input 2:
    A = [5, 17, 100, 11]
    B = 3
Output 2:
    123
      
      
      
      
      
      
      
      
      
      public class Solution {
    public int solve(int[] A, int B) {

        Arrays.sort(A);
        int maxBsum=0;
        int minBsum=0;
        int totalSum=0;
        int n=A.length;

        for(int i=0;i<B;i++){
            minBsum+=A[i];
        }

        for(int i=n-1;i>n-B-1;i--){
            maxBsum+=A[i];
        }

        for(int i=0;i<n;i++){
            totalSum+=A[i];
        }

        int s1=Math.abs(maxBsum-(totalSum-maxBsum));
        
        int s2= Math.abs(minBsum-(totalSum-minBsum));
        
        return Math.max(s1,s2);
    }
}
