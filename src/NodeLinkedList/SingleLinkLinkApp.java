package NodeLinkedList;

public class SingleLinkLinkApp {
    public static void main(String[] args){
        SingleNodeOperations operations = new SingleNodeOperations();
        SingleNode singleNode=null;
        singleNode = operations.addDataToNode(singleNode,10);
        singleNode = operations.addDataToNode(singleNode,15);
        singleNode = operations.addDataToNode(singleNode,16);
        singleNode = operations.addDataToNode(singleNode,22);
        singleNode = operations.addDataToNode(singleNode,14);
        operations.printSingleNode(singleNode);
        operations.printNthNodeFromLast(singleNode,3);
        operations.deleteNodeWithAddress(singleNode,singleNode.next);
        operations.printSingleNode(singleNode);
        operations.deleteNodeWithAddress(singleNode,singleNode);
        operations.printSingleNode(singleNode);
        operations.deleteNodeWithAddress(singleNode,singleNode.next);
        operations.printSingleNode(singleNode);
        operations.deleteNodeWithAddress(singleNode,singleNode.next);
        operations.printSingleNode(singleNode);

    }
}
