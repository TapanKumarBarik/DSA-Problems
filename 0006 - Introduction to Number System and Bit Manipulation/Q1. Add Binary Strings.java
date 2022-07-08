Problem Description
Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
  
  
  
  
  
  public class Solution {
    public String addBinary(String A, String B) {

        StringBuilder sb=new StringBuilder();
        int m=A.length()-1;
        int n=B.length()-1;
        int carry=0;
        while(m>=0 && n>=0){
            int sum=(A.charAt(m)-'0')+(B.charAt(n)-'0')+carry;
            carry=sum/2;//1+1
            sb.append(sum%2);
            m--;
            n--;
        }
        while(m>=0){
            int sum=(A.charAt(m)-'0')+carry;
            carry=sum/2;//1+1
            sb.append(sum%2);
            m--;
        }

        while(n>=0){
            int sum=(B.charAt(n)-'0')+carry;
            carry=sum/2;//1+1
          sb.append(sum%2);
            n--;
        }
        if(carry!=0){
         sb.append(carry);  
        }

        return sb.reverse().toString();
    }
}
