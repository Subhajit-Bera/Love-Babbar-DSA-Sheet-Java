
//Remove Duplicates in a sorted Linked List.
//Problem Link:
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

//TC:0(n) SC:0(1)
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class Q6_RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }

        return head;
    }
}
