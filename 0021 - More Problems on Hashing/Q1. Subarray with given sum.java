Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
   
   
   
   
   
   
   public class Solution {
    public int[] solve(int[] A, int B) {
        int i=0;
        int j=0;
        int n=A.length;
        int sum=0;
        ArrayList<Integer>arr=new ArrayList();
        boolean flag=false;
        while(i<n){
            if(sum==B){
                makearr(arr,A,j,i);
                flag=true;
                break;
            }
            sum+=A[i];
            while(sum>B){
                sum-=A[j];
                j++;
            }
            i++;
        }
        if( flag==false && sum==B){
         makearr(arr,A,j,i);
        }
        int []res=new int[arr.size()];
        i=0;
        for( i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }

        int []a={-1};
        if(arr.size()==0){
            return a;
        }
        return res;
    }
    private void makearr(ArrayList<Integer>arr,int[]A,int i, int j){

        for(int k=i;k<j;k++){
            arr.add(A[k]);
        }
    }
}
