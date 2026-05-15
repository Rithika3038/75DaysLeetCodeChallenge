class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode nextNode = head.next;

        while (nextNode != null) {

            if (current.val == nextNode.val) {
                current.next = nextNode.next;
            } else {
                current = nextNode;
            }

            nextNode = current.next;
        }

        return head;
    }
}