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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null  || k==0){
            return head;
        }

        int count=1;
    
        ListNode temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
      

        if(k%count==0) return head;
        k=k%count;
        // ListNode last=temp;
        temp.next=head;

        int nexttrack=count-k;

        temp=head;
           while(temp!=null && nexttrack>1){
            nexttrack--;
            temp=temp.next;
        }

        ListNode newhead=temp.next;
        temp.next=null;
        
        head=newhead;

        return head;

    }
}