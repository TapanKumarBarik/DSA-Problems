Problem Description

You are given a 2D integer matrix A, return a 1D integer vector containing row-wise sums of original matrix.



Problem Constraints

1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format

First argument is a vector of vector of integers.(2D matrix).



Output Format

Return a vector conatining row-wise sums of original matrix.



Example Input

Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output

Output 1:

{10,26,18}


Example Explanation

Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18
  
  
  
  
  
  
  
  
  public class Solution {
    public int[] solve(int[][] A) {

        int n=A[0].length;
        
        int index=0;
        int m=A.length;
        int []arr=new int[m];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){

                sum+=A[i][j];
            }
            arr[index]=sum;
            index++;
        }

        return arr;
    }
}

