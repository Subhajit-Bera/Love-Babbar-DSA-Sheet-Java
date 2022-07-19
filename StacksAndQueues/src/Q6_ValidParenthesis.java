import java.util.Stack;



//Question : https://practice.geeksforgeeks.org/problems/valid-expression1025/1 (gfg)
//        https://leetcode.com/problems/valid-parentheses/  (leetcode)

//TC:0(n)  SC:0(n)


public class Q6_ValidParenthesis {
    public static boolean isOpening(char a){
        return a=='(' || a=='{' || a=='[';
    }

    public static boolean isEqual(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
    public static boolean balancedParenthesis(String s){

        if(s==null || s.length()<2 || s.length()%2!=0){ //It's length have to be even ,otherwise it can't be balance.
            return false;
        }

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(isOpening(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){   //This is closing bracket and Stack empty means before closing bracket there is no opening bracket
                    return false;
                }

                if(!isEqual(stack.peek(),s.charAt(i))){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        System.out.println(balancedParenthesis("{([])}"));
    }

}
