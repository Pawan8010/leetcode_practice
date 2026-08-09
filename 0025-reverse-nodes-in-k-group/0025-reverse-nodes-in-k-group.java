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
    private ListNode revers(ListNode temp){
        ListNode p=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=p;
            p=temp;
            temp=next;
        }
        return p;

    }
     private ListNode kth(ListNode temp,int k){
         
        while(temp!=null && k>1){
            k--;
            temp=temp.next;
        }
        return temp;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevt=null;
        while(temp!=null){
            // fing the kth Node
            ListNode kthnode=kth(temp,k);

            if(kthnode==null){
                //   connecting to prenode
                if(prevt!=null) prevt.next=temp;
                break;
            }
           
            // reverse the list of kth
            ListNode newnode=null;
            newnode=kthnode.next;
            kthnode.next=null;
            revers(temp);
             if(temp==head){
                head=kthnode;
             }
             else{
                prevt.next=kthnode;
             }

             prevt=temp;
             temp=newnode;

        }
        return head;
        
    }
}