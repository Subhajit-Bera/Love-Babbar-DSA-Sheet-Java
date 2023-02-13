
//Write a Program to check whether the Singly Linked list is a palindrome or not.


//Problem Link:
//https://leetcode.com/problems/palindrome-linked-list/
//https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

//TC:0(n/2)+0(n/2)+0(n/2)
//SC:0(1)
public class Q18_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode temp1=head;
        ListNode temp2=middle(head);
        temp2=temp2.next;
        temp2=reverse(temp2);


        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;

    }

    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public ListNode reverse(ListNode head){
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
