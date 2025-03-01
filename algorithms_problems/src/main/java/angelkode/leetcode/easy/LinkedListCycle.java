package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> visits = new HashMap<>();
        if(head == null || head.next == null) return false;

        while (head != null) {
            if(visits.get(head) != null && visits.get(head) == 1){
                return true;
            }
            visits.put(head, 1);
            head = head.next;
        }

        return false;
    }
}
