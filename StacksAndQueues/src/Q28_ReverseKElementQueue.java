//Reverse the first “K” elements of a queue

//Problem Link:
//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

//https://www.codingninjas.com/codestudio/problems/reverse-first-k-elements-of-queue_982771?leftPanelTab=0

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Q28_ReverseKElementQueue {
    //Approach 1: O(n)  SC:O(2k) [An extra stack and an answer queue to store the answer]
    public Queue<Integer> reverseElements(Queue<Integer> q, int k){
        Stack<Integer> st=new Stack<>();
        Queue<Integer> ans=new LinkedList<>();

        while(!q.isEmpty() && k>0){
            st.push(q.poll());
            k--;
        }
        while(!st.isEmpty()){
            ans.offer(st.pop());
        }

        while(!q.isEmpty()){
            ans.offer(q.poll());
        }

        return ans;
    }

    //Approach 2:  TC:O(n)  SC:O(k)[Uses an extra stack]
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st=new Stack<>();
        Queue<Integer> ans=new LinkedList<>();

        int x=k;
        while(k!=0){
            st.push(q.poll());
            k--;
        }

        while(!st.isEmpty()){
            q.offer(st.pop());
        }

        for(int i=0;i<q.size()-x;i++){
            q.offer(q.poll());
        }
        return q;
    }


    public static void main(String[] args) {

    }
}
