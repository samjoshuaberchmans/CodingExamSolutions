package NodeLinkedList;

public class SingleNodeOperations {

    public SingleNode addData(SingleNode head , int d){
        SingleNode newNode = new SingleNode(d);
        SingleNode forOperation = head;
        if(head == null){
            forOperation = newNode;
        } else{
            while(forOperation.next != null) {
                forOperation = forOperation.next;
            }
            forOperation.next = newNode;
        }
        head = forOperation;
//        head = newNode;
        return head;
    }

    public SingleNode addDataToNode(SingleNode head , int d){
        SingleNode newNode = new SingleNode(d);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void printNthNodeFromLast(SingleNode head , int d){

        int lengthOfNode = 0;

        SingleNode tempNode = head;

        while(tempNode!=null){
            tempNode = tempNode.next;
            lengthOfNode++;
        }
        System.out.println("Length - " + lengthOfNode);

        tempNode = head;

        for(int i = 0 ; i < lengthOfNode-d; i++){
            tempNode = tempNode.next;
        }
        System.out.println("Value - " + tempNode.data);
    }

    public SingleNode deleteNodeWithAddress(SingleNode inNode , SingleNode deleteNode){
        SingleNode temp = deleteNode.next;
        if(deleteNode.next != null) {
            deleteNode.data = temp.data;
            deleteNode.next = temp.next;
        }else{
            temp = inNode;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return inNode;
    }

    public void printSingleNode(SingleNode head){
        SingleNode inNode = head;
        System.out.println(" ");
        while (inNode != null){
            System.out.print(inNode.data+" ");
            inNode = inNode.next;
        }
    }
}
