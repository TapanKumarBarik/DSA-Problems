Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47 


Example Output
Output 1:

 102030 
Output 2:

 434755 


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030 
Explanation 2:

 43 + 47 + 55 = 434755 

   
   
   
   //****************************************************************************8//
   
   public class Solution {
    public int solve(int A, int B, int C) {
         int a[] = {A, B, C};
        Arrays.sort(a);
        return 10000*a[0] + 100*a[1] + a[2];
    }
}


//*************************************************************************************

public class Solution {
    public int solve(int A, int B, int C) {
        
        String s= "";
        
   int []arr=new int[3];
   arr[0]=A;
   arr[1]=B;
   arr[2]=C;
   Arrays.sort(arr);
   s+=arr[0];
   s+=arr[1];
   s+=arr[2];
 
        
        return Integer.parseInt(s);
    }
}
