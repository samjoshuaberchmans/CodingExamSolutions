package binarySearchTree;

class BST {
	
	public Node createNewNode(int k){
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	
	public Node insert(Node node , int val){
		if(node == null){
			return createNewNode(val);
		}		
		if(val < node.data){
			node.left = insert(node.left, val);
		}else if(val > node.data){
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public void printBSTInorder(Node node){
		if (node == null){
			return;
		}
		
		printBSTInorder(node.left);
		System.out.println(node.data+ " ");
		printBSTInorder(node.right);
	}
	
	public void printBST(Node node){
	}
	
	public boolean isBST(Node node , Node left , Node right){
		if(node == null)
			return true;
		
		if(left != null && node.data <= left.data)
			return false;
		
		if(right != null && node.data >= right.data)
			return false;
		
		return isBST(node.left, left , node) && isBST(node.right, node , right);
	}
}
