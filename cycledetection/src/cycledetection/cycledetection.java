package cycledetection;

import java.util.*;
class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public class cycledetection{
static boolean hasCycle(SinglyLinkedListNode head) {
    if(head==null||head.next==null)
    {
        return false;
    }
    SinglyLinkedListNode a=head;
    SinglyLinkedListNode b=head.next;
    while(a!=b)
    {
        if(b==null||b.next==null)
        {
        return false;
    }
    a=a.next;
    b=b.next.next;
    }
    return true;

}
}
