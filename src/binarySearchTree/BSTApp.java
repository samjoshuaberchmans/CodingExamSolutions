package binarySearchTree;

public class BSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST a = new BST();
		Node b = new Node();
//		8 ,3,6,10,4,7,1,14,13
		b = a.insert(b, 8);
		b = a.insert(b, 3);
		b = a.insert(b, 6);
		b = a.insert(b, 10);
		b = a.insert(b, 4);
		b = a.insert(b, 7);
		b = a.insert(b, 1);
		b = a.insert(b, 14);
		b = a.insert(b, 13);
		
		a.printBSTInorder(b);
	}

}
