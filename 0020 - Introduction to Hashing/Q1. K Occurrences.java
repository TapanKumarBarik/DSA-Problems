Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency B.

He then sums up the heights that occur B times. (He adds the height only once to the sum and not B times).

But the sum he ended up getting was huge so he prints it modulo 10^9+7.

In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:

1.   1<=N<=100000
2.   1<=B<=N
3.   0<=H[i]<=10^9
Input: Integers N and B and an array C of size N

Output: Sum of all numbers in the array that occur exactly B times.

Example:

Input:

N=5 ,B=2 ,C=[1 2 2 3 3]
Output:

5
Explanation:

There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
  
  
  
  
  
  
  public class Solution {
    public int getSum(int A, int B, int[] C) {

        HashMap<Integer,Integer>map=new HashMap();
        int n=C.length;
        for(int i=0;i<n;i++){
            int curr=C[i];

            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr, freq+1);
            }
            else{
                map.put(curr,1);
            }
        }

        //
        boolean flag=false;

        int count=0;
        for(int i=0;i<n;i++){
            int curr=C[i];
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                if(freq==B){
                    flag=true;
                    count+=curr;
                    count=count%1000000007;
                }
                map.remove(curr);
            }
        }
        if(count==0 && flag==false)return -1;
        return count;
    }
}
