class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int c=0;
        while(c!=k && curr!=null)
        {
            curr=curr.next;
            c++;
        }
        if(c==k)
        {
            curr=reverseKGroup(curr,k);
            while(c>0)
            {
                ListNode temp=head.next;
                head.next=curr;
                curr=head;
                head=temp;
                c--;
            }
            head=curr;
        }
        return head;
    }
}
