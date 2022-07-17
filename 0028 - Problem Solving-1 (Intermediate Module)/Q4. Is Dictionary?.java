Problem Description
Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



Problem Constraints
1 <= N, length of each word <= 105

Sum of the length of all words <= 2 * 106



Input Format
The first argument is a string array A of size N.

The second argument is a string B of size 26, denoting the order.



Output Format
Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



Example Input
Input 1:

 A = ["hello", "scaler", "interviewbit"]
 B = "adhbcfegskjlponmirqtxwuvzy"
Input 2:

 A = ["fine", "none", "no"]
 B = "qwertyuiopasdfghjklzxcvbnm"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The order shown in string B is: h < s < i for the given words. So return 1.
Explanation 2:

 "none" should be present after "no". Return 0.
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int solve(String[] A, String B) {

             HashMap<Character,Integer>map=new HashMap();

        for(int i=0;i<B.length();i++){
            map.put(B.charAt(i),i);
        }

      for(int i=0;i<A.length-1;i++){
          String word1=A[i];
          String word2=A[i+1];
          int flag=0;

          for(int j=0;j<Math.min(word1.length(),word2.length());j++){
              int num1=map.get(word1.charAt(j));
              int num2=map.get(word2.charAt(j));
              if(num1>num2){
                  return 0;
              }

               if(num1 < num2){
                    flag = 1;
                    break;
                }
             
          }
          if(flag==0){
              if(word1.length()>word2.length()){
                  return 0;
              }
          }
      }

      return 1;

    }
}
