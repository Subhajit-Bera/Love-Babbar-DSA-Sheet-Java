//Count and Say problem


//Problem Link: https://leetcode.com/problems/count-and-say/description/

public class Q7_CountAndSay {
    //TC:0(n)  SC:0(n) -> Recursion stack space
    public String countAndSay(int n) {
        if(n==1) return "1";  //Base condition

        String s=countAndSay(n-1); //Recursion : we need answer of previous value everytime . So we use recursion.


        StringBuilder str=new StringBuilder();
        int count=0;

        for(int i=0;i<s.length();i++){
            count++;
            if(i==s.length()-1 || s.charAt(i)!= s.charAt(i+1)){
                str.append(count).append(s.charAt(i));
                count=0;
            }
        }

        return str.toString();

    }
}
