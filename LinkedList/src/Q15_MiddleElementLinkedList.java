
//Find the middle Element of a linked list.
//Problem Link:
//https://leetcode.com/problems/middle-of-the-linked-list/description/
//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

//TC:0(n) SC:0(1)
public class Q15_MiddleElementLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}
