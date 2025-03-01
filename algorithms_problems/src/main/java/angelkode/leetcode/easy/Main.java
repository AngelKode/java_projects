package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.ListNode;
import angelkode.leetcode.easy.extraClasses.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode cicleNode = new ListNode(2);
        head.next = cicleNode;
        cicleNode.next = new ListNode(0);
        cicleNode.next.next = new ListNode(4);
        cicleNode.next.next.next = cicleNode;
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(head));

    }
}
