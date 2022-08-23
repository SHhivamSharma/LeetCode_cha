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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true ;
         
        ListNode mid =middleNode(head);
        ListNode nhead = mid.next;
        mid.next = null ;
        
        boolean ans = true ;
        
        nhead = reverse(nhead);
        ListNode c1 = head;
        ListNode c2 = nhead;
         while( c2 != null){
             if(c1.val != c2.val){
                 ans = false ;
                 break ;
             }
             c1 = c1.next;
             c2=c2.next;
         }
        
        nhead = reverse(nhead);
        mid.next = nhead;
        return ans;
         
    }
    
      public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)     return head;

     
     ListNode slow = head;
     ListNode fast = head;
     
     while(fast.next != null && fast.next.next != null  ){
         slow = slow.next;
         fast = fast.next.next;
         
     }
     return slow;

          
        
    } 
    
    
    public ListNode reverse (ListNode head){
         if(head == null || head.next == null) return head ;
        
        ListNode curr = head ;
        ListNode pre = null ;
        ListNode fow = null ;
        while ( curr != null ){
            fow = curr.next;
        
            curr.next = pre ;
            pre = curr;
            curr = fow;
        }
return pre ;
    }
}