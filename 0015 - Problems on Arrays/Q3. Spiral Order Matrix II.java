Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements in spiral order.



Example Input
Input 1:

1
Input 2:

2


Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]


Example Explanation
Explanation 1:

 
Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class Solution {
    public int[][] generateMatrix(int A) {

        int n=A;

        int [][]arr=new int[A][A];

        int rowBegin=0;
        int rowEnd=n-1;
        int columnBegin=0;
        int columnEnd=n-1;

    int count=1;
        while(rowBegin<=rowEnd && columnBegin<=columnEnd){


            for(int i=columnBegin;i<=columnEnd;i++){
                arr[rowBegin][i]=count;
                count++;
            }

            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                arr[i][columnEnd]=count;
                count++;
            }
            columnEnd--;

            for(int i=columnEnd;i>=columnBegin;i--){
                arr[rowEnd][i]=count;
                count++;
            }
            
        rowEnd--;
            for(int i=rowEnd;i>=rowBegin;i--){
                arr[i][columnBegin]=count;
                count++;
            }
            columnBegin++;
        }
        return arr;
    }
}
//column begin--colum End
//[rowBegin][i];
//rowBegin++;
//rowBegin to rowEnd
//[i][columnEnd]
//columnEnd--;
//columnEnd to columnBegin
//[rowEnd][i]
//rowEnd--;
//rowEnd  to rowBegin
//[i][columnBegin]
//columnBegin++;

