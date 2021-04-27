package binarySearchTree;

class InorderBinaryTreeOperations {
    public static void main(String[] args){
        InorderBinaryTreeApp app = new InorderBinaryTreeApp();
        InorderNode rootNode = null , pointerNode = null , inOrderSuccessorNode = null , minNode = null;

        int[] inputArray = {20 , 8 , 22 , 4 , 12,10,14};
//        int[] inputArray = {}
        rootNode = app.insertValueInBST(rootNode,20);
        rootNode = app.insertValueInBST(rootNode,8);
        rootNode = app.insertValueInBST(rootNode,22);
        rootNode = app.insertValueInBST(rootNode,4);
        rootNode = app.insertValueInBST(rootNode,12);
        rootNode = app.insertValueInBST(rootNode,10);
        rootNode = app.insertValueInBST(rootNode,14);
// rootNode = app.insertValueInBST(rootNode,20);
// rootNode = app.insertValueInBST(rootNode,20);
        pointerNode = rootNode.left.right.right;
//         Inorder successor with parent node
        inOrderSuccessorNode = app.InOrderSuccessorWithPointer(rootNode,pointerNode);
//         Inorder successor without parent node
        inOrderSuccessorNode = app.InorderSuccessorWithoutPointer(rootNode,pointerNode);

        if(inOrderSuccessorNode != null) {
            System.out.println("Inorder Successor - Pointer " + pointerNode.data + " - Value - " + inOrderSuccessorNode.data);
        }else{
            System.out.println("No Successor found");
        }

        if(app.isBST(rootNode,null , null)){
            System.out.println("BST");
        }else{
            System.out.println("Not a BST");
        }

    }
}
