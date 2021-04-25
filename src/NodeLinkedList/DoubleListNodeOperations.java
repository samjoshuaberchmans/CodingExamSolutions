package NodeLinkedList;

import java.nio.file.Files;

public class DoubleListNodeOperations {
//    head is for only holding the First node. Telling it is a header.
//    public static DoubleNode head;

//    Operations begins from here.

    public DoubleNode push(DoubleNode head ,int d){
//        Create new object ,use constructor to add into the node, assign next to head and prev to null for this node.
            DoubleNode newNode = new DoubleNode(d);
            newNode.next = head;
            newNode.previous = null;

//          This step will make sure if Head is having 5 or 6 nodes inside already , will make sure this is first and then add then point the next previous to current node.
            if(head != null){
                head.previous = newNode;
            }
            head = newNode;
            return head;
    }

    public DoubleNode addAfter(DoubleNode head , DoubleNode previousNode , int d){
        if(previousNode != null ){
//            Create a new node.
            DoubleNode newNode = new DoubleNode(d);
//            Point newNode.next to previousNode.next;
            newNode.next = previousNode.next;
//            Point New node previous to Previous node and previous node next to new node.
            newNode.previous = previousNode;
            previousNode.next = newNode;
//            Missing element would next Nodes Previous should be marked to new node.
//            This can be achieved to check if newNode.next is not null and then use the previous from newNode.next to point to newNode.
            if(newNode.next != null){
                newNode.next.previous = newNode;
            }
        }else{
            System.out.println("The Previous Node provided is null");
            return head;
        }
        return head;
    }

    public DoubleNode addAtLast(DoubleNode head , int d){
        DoubleNode newNode = new DoubleNode(d);
        DoubleNode last = head;

        if (head == null){
            newNode.previous = null;
            head = newNode;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next = newNode;
        newNode.previous = last;
        return head;
    }

    public void printDoubleLinkedList(DoubleNode head){
        DoubleNode last = null;
        DoubleNode inNode = head;
        System.out.println("Forward");
        while(inNode != null){
            System.out.println(inNode.data + " ");
            last = inNode;
            inNode = inNode.next;
        }

        System.out.println("Reverse");
        while(last != null){
            System.out.println(last.data+" ");
            last = last.previous;
        }
    }

}
