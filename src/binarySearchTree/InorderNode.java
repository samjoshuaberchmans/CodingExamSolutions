package binarySearchTree;

class InorderNode {
    int data;
    InorderNode left , right , parent;

    InorderNode (int d){
        data = d;
        left = right = parent = null;
    }
}
