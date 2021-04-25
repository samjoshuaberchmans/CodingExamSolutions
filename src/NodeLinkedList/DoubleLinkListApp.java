package NodeLinkedList;

public class DoubleLinkListApp {
    public static void main(String[] args){
        DoubleListNodeOperations operation = new DoubleListNodeOperations();
        DoubleNode operationHead = null;
        operationHead = operation.push(operationHead,6);
//        operation.printDoubleLinkedList(operationHead);
        operationHead = operation.push(operationHead,8);
//        operation.printDoubleLinkedList(operationHead);
        operationHead = operation.addAtLast(operationHead,10);
//        operation.printDoubleLinkedList(operationHead);
//        operation.printDoubleLinkedList(operationHead.next);
        operationHead =operation.addAfter(operationHead,operationHead.next,13);
//        operation.printDoubleLinkedList(operationHead);
        operationHead =operation.addAfter(operationHead,operationHead.next,14);
//        operation.printDoubleLinkedList(operationHead);
        operationHead =operation.addAfter(operationHead,operationHead.next.next,17);
        operation.printDoubleLinkedList(operationHead);
    }
}
