//Reverse a String

//Problem Link:
//https://leetcode.com/problems/reverse-string/solutions/?orderBy=most_votes&languageTags=java


import java.util.Arrays;

public class Q1_ReverseAString {
    //TC:0(L) SC:0(1) L-> Length of string
    public void reverseString(char[] s){
        int start=0;
        int end=s.length-1;

        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }

    //Using Recursion:
    //TC:0(L) SC:0(L)->Recursion stack space
    public void reverseRecursion(char[]s){
        int start=0;
        int end=s.length-1;
        solve(s,start,end);
    }
    public void solve(char[]s,int i,int j){
        if(i>=j){
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        solve(s,++i,--j);
    }


    //When argument is String
    //TC:0(L) SC:0(L) L-> Length of string
    public String reverseString2(String s){
        char[] arr=s.toCharArray();
        String revString="";
        for(char c: arr){
            revString=c+revString;
        }
        return revString;
    }

    //Using StringBuilder
    public String reverseStringBuilder(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
