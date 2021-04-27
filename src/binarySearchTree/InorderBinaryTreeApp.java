package binarySearchTree;

class InorderBinaryTreeApp {
    InorderNode insertValueInBST(InorderNode inNode , int d){
        if(inNode == null){
            return new InorderNode(d);
        } else {
            InorderNode temp = null;
            if(d < inNode.data){
                temp=insertValueInBST(inNode.left,d);
                inNode.left = temp;
                temp.parent = inNode;
            } else {
                temp=insertValueInBST(inNode.right,d);
                inNode.right = temp;
                temp.parent = inNode;
            }
        }
        return inNode;
    }

    InorderNode minValue(InorderNode inNode){
        InorderNode currentOne = inNode;

        while (currentOne.left != null){
            currentOne = currentOne.left;
        }
        return currentOne;
    }

    public boolean isBST(InorderNode node , InorderNode left , InorderNode right){
        if(node == null)
            return true;

        if(left != null && node.data <= left.data)
            return false;

        if(right != null && node.data >= right.data)
            return false;

        return isBST(node.left, left , node) && isBST(node.right, node , right);
    }

    InorderNode InOrderSuccessorWithPointer(InorderNode inNode , InorderNode pointerNode){
        if(pointerNode.right != null){
            return minValue(pointerNode.right);
        }

        InorderNode temp = pointerNode.parent;

        while( temp != null && pointerNode == temp.right){
            pointerNode = temp;
            temp = temp.parent;
        }
        return temp;
    }

    InorderNode InorderSuccessorWithoutPointer(InorderNode inNode , InorderNode pointerNode){
        InorderNode successorNode = null ;
        if(pointerNode.right != null){
            successorNode = minValue(pointerNode.right);
            return successorNode;
        }

        while(inNode != null){
            if(pointerNode.data < inNode.data){
                successorNode = inNode;
                inNode = inNode.left;
            }else if(pointerNode.data > inNode.data){
                inNode = inNode.right;
            } else
                break;
        }
        return successorNode;
    }
}
