public class llreverse {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    
}
}
