import java.util.ArrayList;
import java.util.Stack;

public class Q14_ReverseStackRecursion {


    //Brute Force Using an extra stack
    //TC: 0(n)  SC: O(n)
//    static ArrayList<Integer> reverse(Stack<Integer> s){
//        Stack<Integer> st=new Stack<>();
//
//        while(!s.isEmpty()){
//            st.push(s.pop());
//        }
//
//        ArrayList<Integer> ans=new ArrayList<>(st);
//        return ans;
//    }

    //Optimal Approach using Recursion:

    //CODE 1:
    //TC:O(n*n) ->For every element we have to call insertAtBelow function and popped all element present in the stack
    // This is the worst case of insertBelow function.
    //SC:O(1) [Auxiliary Stack Space :O(n)]
    public static void insertAtBelow(Stack<Integer>s,int a){
        if(s.size()==0){
            s.push(a);
        }else{
            int x=s.pop();
            insertAtBelow(s,a);
            s.push(x);
        }
    }

    public static void reverseRecursion(Stack<Integer>s){
        if(s.size()>0){
            int element=s.pop();
            reverseRecursion(s);
            insertAtBelow(s,element);
        }
    }
//    public static ArrayList<Integer> reverse(Stack<Integer> s){
//        reverseRecursion(s);
//        ArrayList<Integer> ans=new ArrayList<>(s);
//        return ans;
//
//    }



    //CODE 2:
    //TC:0(n)
    //SC:0(1)[Auxiliary Stack Space :O(n)]

    static ArrayList<Integer> reverseRec(Stack<Integer>s,ArrayList<Integer>ans){
        if(s.isEmpty()){
            return ans;
        }
        ans.add(s.pop());
        reverseRec(s,ans);
        return ans;
    }

    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        return reverseRec(s,ans);

    }



    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(reverse(s));
    }
}
