
//Reverse a Queue using recursion


//Problem Link:
//https://practice.geeksforgeeks.org/problems/queue-reversal/1


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q27_QueueReversal {
    //Approach 1: Using stack  TC:O(n) SC:O(n)
    public static void reverseStack(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }


    //Approach 2: Using Recursion  TC:O(n) SC:O(1) [Auxiliary Space]
    public static void reverse(Queue<Integer> q){
        if(!q.isEmpty()){
            int x=q.poll();
            reverse(q);
            q.offer(x);
        }
    }

    public static Queue<Integer> rev(Queue<Integer> q){
//        reverseStack(q);
        reverse(q);
        return q;
    }




    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(4);
        queue.offer(3);
        queue.offer(1);
        queue.offer(10);
        queue.offer(2);
        queue.offer(6);

        System.out.println(rev(queue));
    }
}
