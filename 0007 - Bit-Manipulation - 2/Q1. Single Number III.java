Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.



Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.


  
  
  
  
  
  
  
  
  
  
  
  
  public class Solution {
    public int[] solve(int[] A) {

        int []arr=new int[2];

        int xor=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            xor^=A[i];
        }

        int lsb= xor & -xor;

        int xor1=0;
        int xor2=0;

        for(int i=0;i<n;i++){

            if( (A[i]&lsb)==0  ){
                xor1^=A[i];
            }
            else{
                xor2^=A[i];
            }
        }

        arr[0]=Math.min(xor1, xor2);
        arr[1]=Math.max(xor1, xor2);

        return arr;
    }
}
