Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.
  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {

        int n=A.length;

        HashMap<Integer,Integer>map=new HashMap();

        for(int i=0;i<n;i++){
            int curr=A[i];
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr, freq+1);
            }
            else{
                map.put(curr,1);
            }
        }

        for(int i=0;i<n;i++){
           int a1=A[i];
           int a2=A[i]-B;
            //edge case 1
            if(a1==a2){
                if(map.get(a2)>1){
                    return 1;  
                }
            }
            //case 2
            else{
                  if(map.containsKey(a2)){
                    return 1;  
                } 
            }
        }
        return 0;
    }
}
