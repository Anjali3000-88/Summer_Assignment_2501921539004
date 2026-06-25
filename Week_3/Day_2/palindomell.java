public class palindomell {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        ListNode prevNode = null;
        while(slowptr != null){
            ListNode nextNode = slowptr.next;
            slowptr.next = prevNode;
            prevNode = slowptr;
            slowptr = nextNode;
        }
        LisNode first = head;
        ListNode second = prevNode;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
        