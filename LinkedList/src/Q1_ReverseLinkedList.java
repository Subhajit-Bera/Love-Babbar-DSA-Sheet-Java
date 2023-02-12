
//Write a Program to reverse the Linked List. (Both Iterative and recursive)

//Problem Link:
//https://leetcode.com/problems/reverse-linked-list/description/
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}


public class Q1_ReverseLinkedList {
    //Iterative: TC:0(n) SC:0(1)
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;
        ListNode nxt=curr.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nxt;

            if(curr!=null){
                nxt=curr.next;
            }
        }

        head=prev;

        return head;
    }
}
