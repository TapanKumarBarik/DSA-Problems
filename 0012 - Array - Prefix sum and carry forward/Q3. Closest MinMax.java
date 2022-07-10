Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {

        int n=A.length;

        // if(n<2)return n;

        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        int minIndex=-1;

        
        
        int min=Integer.MAX_VALUE;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            min=Math.min(min, A[i]);
            max=Math.max(max,A[i]);
        }

//There can be multiple max and min so we need to find the optimal max and min
        for(int i=0;i<n;i++){


            if(A[i]==min){
                minIndex=i;
                if(maxIndex!=-1){
                    res=Math.min(res, i-maxIndex+1);
                }
            }


            //

            if(A[i]==max){
                maxIndex=i;
                if(minIndex!=-1){
                    res=Math.min(res, i-minIndex+1);
                }
            }
          
        }

        return res;

    }
}
