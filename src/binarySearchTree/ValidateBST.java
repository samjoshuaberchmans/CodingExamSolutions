package binarySearchTree;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3 , 2, 5 , 1 , 4
		BST a = new BST();
		Node node = a.createNewNode(3);
		node.left = a.createNewNode(2);
		node.right = a.createNewNode(5);
		node.left.left = a.createNewNode(1);
		node.left.right = a.createNewNode(4);
		
		if (a.isBST(node,null,null)){
			System.out.println("IS BST");
		}else{
			System.out.println("Not a BST");
		}
	}

}
