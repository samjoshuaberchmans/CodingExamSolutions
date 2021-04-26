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

    public void printSinglNode(SingleNode head){
        SingleNode inNode = head;
        while (inNode != null){
            System.out.println(inNode.data);
            inNode = inNode.next;
        }
    }

}
