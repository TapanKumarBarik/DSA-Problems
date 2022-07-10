Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.



Problem Constraints

1 <= N <= 105

1 <= A[i] <= 108



Input Format

First and only argument is an integer array A.



Output Format

Return an integer array denoting all the leader elements of the array.

NOTE: Ordering in the output doesn't matter.



Example Input

Input 1:

 A = [16, 17, 4, 3, 5, 2]
Input 2:

 A = [1, 2]


Example Output

Output 1:

 [17, 2, 5]
Output 2:

 [2]


Example Explanation

Explanation 1:

 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
Explanation 2:

 Only 2 the rightmost element is the leader in the array.


   
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int[] solve(int[] A) {

        ArrayList<Integer>list=new ArrayList();

        int n=A.length;
        int currMax=A[n-1];
        list.add(currMax);
        for(int i=n-2;i>=0;i--){

            if(A[i]>currMax){
                currMax=A[i];
                list.add(currMax);
            }
        }


        int m=list.size();
        int []arr=new int [m];
        int index=0;

        for(int i=m-1;i>=0;i--){
            arr[index]=list.get(i);
            index++;
        }

        return arr;
    }
}