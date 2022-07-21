
//Interleave the first half of the queue with second half

//Problem Link:
//https://www.geeksforgeeks.org/interleave-first-half-queue-second-half/
//https://www.codingninjas.com/codestudio/problems/interleave-the-first-half-of-the-queue-with-the-second-half_1169450?leftPanelTab=0


import java.util.Queue;
import java.util.Stack;

public class Q29_InterleaveFirstWithSecondHalf {

    //TC:O(n) SC:O(n)
    public static void interLeaveQueue(Queue < Integer > q) {
        // Write your code here.
        if(q.size()%2 !=0){  //if the size is not even then answer is not possible
            return ;
        }

        Stack<Integer> st=new Stack<>();

        int k=q.size()/2;      //k=Half no of elements present in the queue
        for(int i=0;i<k;i++){  //Fetch k elements into stack
            st.push(q.poll());
        }

        while(!st.isEmpty()){  //Enqueue back all the element of stack into queue again
            q.offer(st.pop());
        }

        for(int i=0;i<k;i++){  //Shift k elements from front to rear of the queue
            q.offer(q.poll());
        }

        for(int i=0;i<k;i++){   //Fetch k element again into stack from queue
            st.push(q.poll());
        }

        for(int i=0;i<k;i++){  //Enqueue each element of stack and queue(add as well as remove) simultaneously  into queue.
            q.offer(st.pop());
            q.offer(q.poll()); //Shifting front element to rear
        }

    }


    public static void main(String[] args) {

    }
}
