package p3;

public class Tree {
	
	
	public static void makeLeftSubTree(Node parent, Node child) {
		parent.setLeft(child);
	}
	public static void makeRightSubTree(Node parent, Node child ) {
		parent.setRight(child);
	}
	
	public static Node getLeftSubTree(Node nd) {
		return nd.getLeft();
	}
	public static Node getRightSubTree(Node nd) {
		return nd.getRight();
	}
	
	public static void preorderTraverse(Node nd) {
		if (nd == null)
			return;
		System.out.printf("%c ", nd.getIsland());
		preorderTraverse(nd.getLeft());
		preorderTraverse(nd.getRight());
	}
	public static void inorderTraverse(Node nd) {
		if(nd == null)
			return;
		inorderTraverse(nd.getLeft());
		System.out.printf("%c ", nd.getIsland());
		inorderTraverse(nd.getRight());
	}
	public static void postorderTraverse(Node nd) {
		if(nd == null)
			return;
		postorderTraverse(nd.getLeft());
		postorderTraverse(nd.getRight());
		System.out.printf("%c ", nd.getIsland());
	}
}
