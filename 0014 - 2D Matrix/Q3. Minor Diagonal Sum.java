Problem Description
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).



Problem Constraints
1 <= N <= 103

-1000 <= A[i][j] <= 1000



Input Format
First and only argument is a 2D integer matrix A.



Output Format
Return an integer denoting the sum of minor diagonal elements.



Example Input
Input 1:

 A = [[1, -2, -3],
      [-4, 5, -6],
      [-7, -8, 9]]
Input 2:

 A = [[3, 2],
      [2, 3]]


Example Output
Output 1:

 -5 
Output 2:

 4 


Example Explanation
Explanation 1:

 A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
Explanation 2:

 A[1][2] + A[2][1] = 2 + 2 = 4



   
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int n=A.length;
        int m=A[0].length;
        int sum=0;
        int i=0;
        int j=m-1;

        while(i<n && j>=0){
            sum+=A[i][j];
            i++;
            j--;
        }

        return sum;
    }
}