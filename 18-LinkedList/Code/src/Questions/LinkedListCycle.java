package Questions;

//https://leetcode.com/problems/linked-list-cycle

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

    //Finding the length of the cycle
    public int lengthCycle(ListNode head) {
        //Using Slow and Fast Pointer Method
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                //Calculate the Length
                ListNode temp = slow;
                int length = 0;

                //1st way of doing it
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;

                //2nd way of doing it
//                while(temp != fast)
//                {
//                    length++;
//                }
//
//                return length+1;
            }
        }
        return 0;
    }

    //https://leetcode.com/problems/linked-list-cycle-ii
    //Returning the Starting point of the Cycle
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        //Checking if the list has Cycle
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0)
        {
            return null;
        }

        //Finding the start node.
        ListNode f = head;
        ListNode s = head;
        while(length > 0)
        {
            s = s.next;
            length--;
        }

        //Moving both forward until they meet at the start.
        while(f != s)
        {
            f = f.next;
            s = s.next;
        }

        return f;
    }

    //https://leetcode.com/problems/happy-number
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

            if(fast ==1 || slow == 1)
            {
                return true;
            }

        }
        while(fast != slow);

        return false;
    }

    private int findSquare(int num)
    {
        int ans = 0;

        while(num > 0)
        {
            int rem = num%10;
            ans += rem * rem;
            num = num / 10;
        }

        return ans;
    }

    //https://leetcode.com/problems/middle-of-the-linked-list
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}