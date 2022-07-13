Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.



Problem Constraints
1 <= N <= 5*105
1 <= num[i] <= 109


Input Format
Only argument is an integer array.


Output Format
Return an integer.


Example Input
[2, 1, 2]


Example Output
2


Example Explanation
2 occurs 2 times which is greater than 3/2.


  
  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int vote=1;
        int num=A[0];

        int n=A.length;

        for(int i=1;i<n;i++){

            if(A[i]==num){
                vote++;
            }
            if(A[i]!=num){
                vote--;

            }

            if(vote==0){
                num=A[i];
                vote++;
            }
        }

        return num;
    }
}
