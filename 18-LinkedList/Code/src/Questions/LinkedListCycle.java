package Questions;

//https://leetcode.com/problems/linked-list-cycle

// Answer in SinglyLinkedList Method named hasCycle.

//Cycle Detection Method is used also known as Fast and Slow Pointer Method.



public class LinkedListCycle {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        //Using Slow and Fast Pointer Method
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }
}