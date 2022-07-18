import java.util.Arrays;


//Question : https://leetcode.com/problems/reverse-string/
//           https://practice.geeksforgeeks.org/problems/reverse-a-string/1


public class Q1_ReverseAnArray {
    public static void reverseString(char[] s){

        //Approach 1 :  TC->0(n)    SC:0(1)
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;

        }


        //Approach 2:  TC->0(n)   SC:0(1)
        int len=s.length;
        for(int i=0;i<len/2;i++){
            char temp=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=temp;
        }

    }

    public static void main(String[] args) {
        char[] s={'a','b','c','d','e'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
