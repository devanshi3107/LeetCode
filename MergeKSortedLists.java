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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=new ListNode(0);
        // add everything to a min heap and the pop elements from it, they'll be sorted
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode head : lists)
        {
            while(head!=null)
            {
                minHeap.add(head.val);
                head=head.next;
            }
        }  // now heap will have all values of the given lists in sorted mannner
        ListNode head= res;
        while(!minHeap.isEmpty())
        {
            head.next=new ListNode(minHeap.remove());
            head=head.next;
        }
        return res.next;
        
        
        
    }
}
