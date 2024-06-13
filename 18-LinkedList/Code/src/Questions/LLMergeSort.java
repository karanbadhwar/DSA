package Questions;

//https://leetcode.com/problems/sort-list

public class LLMergeSort {

    public static void main(String[] args) {
        LLMergeSort list = new LLMergeSort();
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.reverseKGroup(head,2);

        list.display();
    }

    private static ListNode head;

    public void insert(int value)
    {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void display()
    {
        //Imp to take extra temp Node type Variable, if we do this with Head, head itself will move the structure.
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next; // Moving temp forward
        }
        System.out.println("END");
    }

    //Leetcode Question Solution
    public ListNode sortList(ListNode head) {

        //If a list is empty or only have one Node
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode leftList = sortList(head);
        ListNode rightList = sortList(mid);

        return mergeTwoLists(leftList, rightList);

    }

    private static class ListNode {
        int val;
        ListNode next;


        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

        //Merge Two Sorted Lists
        public ListNode mergeTwoLists(ListNode first, ListNode second) {
            ListNode mergedHead = new ListNode();
            ListNode temp = mergedHead;

            while(first != null && second != null)
            {
                if(first.val < second.val)
                {
                    temp.next = first;
                    first = first.next;
                    temp = temp.next;
                } else {
                    temp.next = second;
                    second = second.next;
                    temp = temp.next;
                }
            }

            while(first != null)
            {
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }

            while(second != null)
            {
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
            return mergedHead.next;
        }

        //Getting the middle of the list
        public ListNode middleNode(ListNode head) {
            ListNode midPrev = null;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                midPrev = (midPrev == null)? head : midPrev.next;
                fast = fast.next.next;
            }

            ListNode slow = midPrev.next;
            midPrev.next = null;
            return slow;
        }

    //Checking if the Linked List is Palindrome
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
        {
            return true;
        }

        ListNode mid= middleNode(head);

        //Reversing the Second Half from middle onwards
        ListNode previous = null;
        ListNode current = mid;
        ListNode next = null;

        //Reversing the List
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            if(next != null)
            {
                next = next.next;
            }
        }

        ListNode secondHead = previous;
        ListNode reverseHead = secondHead;

        //Comparing both the halves

        while(head != null && secondHead != null)
        {
            if(head.val != secondHead.val)
            {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        //Reversing the List
        reverseList(reverseHead);

        //This means that one list is empty which means no element was found false;
        if(head == null || secondHead == null)
        {
            return true;
        }
        return false;
    }
    //Iterative reversing of LinkedList (In Place)
    public ListNode reverseList(ListNode head)
    {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        /*
        while(next != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            head = curr;
            next = (next.next == null)? next.next : null;
        }
       */

        // Other way,
        while (curr != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next != null)
            {
                next = next.next;
            }
            head = prev;
        }
        return head;
    }

    //Question Re-Order List
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }

        //Middle of the Linked List
        ListNode mid = middleNode(head);

        //Reverse Second List
        ListNode headSecond =  reverseList(mid);
        ListNode headFirst = head;
        while(headFirst != null && headSecond != null)
        {
            //Passing the First List's Next to a temp variable
            ListNode tempHead = headFirst.next;

            //First List Head pointing next to second List Head
            headFirst.next = headSecond;

            //Moving First list head ahead
            headFirst = tempHead;



            //Passing the second List's head to merge the bridge
            tempHead = headSecond.next;

            //Second List Head pointing next to First List Head
            if(headFirst != null)
            {
                headSecond.next = headFirst;
            } else {
                headSecond.next = tempHead;
            }

            //Moving Second list head ahead
            headSecond = tempHead;

        }

//        //Last remaining node pointing to null i.e. tail
//        if(headSecond != null)
//        {
//            headSecond.next = null;
//        }

    }

    //Reverse Nodes in K Groups
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null || head.next == null) {
            return head;
        }

        // Count the total number of nodes in the list
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If there are fewer nodes than k, return the list as is
        if (count < k) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (count >= k) {
            ListNode last = previous;
            ListNode newEnd = current;
            ListNode next = current.next;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            // Link the reversed part with the previous part
            if (last != null) {
                last.next = previous;
            } else {
                head = previous; // Update head to the new front of the reversed part
            }
            newEnd.next = current; // Link the end of the reversed part to the next part

            // Reduce the count by k, as we have processed k nodes
            count -= k;

            // Move previous to the new end for the next iteration
            previous = newEnd;

            // Link the remaining part of the list
            if (current != null) {
                newEnd.next = current;
            }
        }


        return head;
    }



    //Reversing Alternative K Groups (Not Completed Yet)
    public ListNode reverseAltKGroup(ListNode head, int k) {
        if(k <= 1 || head == null || head.next == null)
        {
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        if(count < k)
        {
            return null;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current != null)
        {
            ListNode last = previous;
            ListNode newEnd = current;
            ListNode next = current.next;

            //reverse
            for (int i = 0; i < k; i++) {

                current.next = previous;
                previous = current;
                current = next;
                if(next != null)
                {
                    next = next.next;
                }
            }

            if(last != null)
            {
                last.next = previous;
            } else {
                head = previous;
            }
            newEnd.next = current;

            if(current.next == null)
            {
                break;
            }

            previous = newEnd;
        }
        return head;
    }

    //Rotate List by k times
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        for (int i = 0; i < k; i++) {

            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            current.next = head;
            head = current;
        }

        return head;
    }
}
