package Questions;

//https://leetcode.com/problems/sort-list

public class LLMergeSort {

    public static void main(String[] args) {
        LLMergeSort list = new LLMergeSort();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();
    }

    private ListNode head;

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
    }
