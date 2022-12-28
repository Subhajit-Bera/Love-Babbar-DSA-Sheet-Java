
//Reverse a String using Stack

//Problem Link:
//https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

import java.util.*;
public class Q7_ReverseStringUsingStack {

    //TC:0(n+n) SC:0(n) stack
    public String reverse(String S){
        //code here
        Stack<Character> st=new Stack<>();

        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }

        String res="";

        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}
