Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.



Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
[1 2 3 1 1]


Example Output
1


Example Explanation
1 occurs 3 times which is more than 5/3 times.

  
  
  
  
  
  
  
  public class Solution {
    public int repeatedNumber(int[] A) {

        int vote1=0;
        int vote2=0;
        int num1=0;
        int num2=0;
        int n=A.length;
    for(int i=0;i<n;i++){   
        if(num1==A[i]){
            vote1++;
            }
            else if(num2==A[i]){
                vote2++;
            }
           else if(vote1==0){
                num1=A[i];
                vote1++;
                
            }
            else if(vote2==0){
                num2=A[i];
                vote2++;
            }
            else{
                vote1--;
                vote2--;
            }
        }  
        //num1i
        int c1=0;
        int c2=0;
        for(int num:A){
            if(num==num1){
                c1++;
            }
            if(num==num2){
                c2++;
            }
        }

        if(c1>n/3)return num1;
        if(c2>n/3)return num2;


        return -1;
        
    }
}
