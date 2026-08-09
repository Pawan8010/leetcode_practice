/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }

        ListNode h2=slow.next;
        slow.next=null;


          ListNode curr=h2;
          ListNode prev=null;
        while(curr!=null){
          ListNode next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }

        ListNode right=prev;
        ListNode left=head;

        while(right!=null){
            ListNode nextleft=left.next;
            ListNode nextright=right.next;

            left.next=right;
            right.next=nextleft;

            left=nextleft;
            right=nextright;

        }


    }
}