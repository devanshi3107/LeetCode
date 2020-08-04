/**************************************
Generate a new linked list by combining all elements at odd places , followed by elements at even places
Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
**************************************/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode odd=head,even=head.next;
        ListNode evenhead=even;
        while(even!=null && even.next!=null)
        {
            odd.next=even.next;  // 1 2 3 4  1->3
            odd=odd.next;  // 3
            even.next=odd.next;  // 2->4
            even=even.next;  // 4
            
        }
        odd.next=evenhead;
        return head;
}
}
