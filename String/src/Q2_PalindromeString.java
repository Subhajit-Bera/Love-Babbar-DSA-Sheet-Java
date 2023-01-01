
//Check whether a String is Palindrome or not

public class Q2_PalindromeString {
    //GFG:https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
    //TC:0(n) SC:0(1)
    int isPalindrome(String S){
        int start=0;
        int end=S.length()-1;
        while(start<end){
            if(S.charAt(start)==S.charAt(end)){
                start++;
                end--;
            }else {
                return 0;
            }
        }
        return 1;
    }



    //Leetcode:https://leetcode.com/problems/valid-palindrome/description/
    //TC:0(n) SC:0(1)
//    public boolean isPalindrome(String s) {
//        s=s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
//
//        int start=0;
//        int end=s.length()-1;
//
//        while(start<end){
//            if(s.charAt(start)==s.charAt(end)){
//                start++;
//                end--;
//            }else{
//                return false;
//            }
//        }
//
//        return true;
//    }
}
