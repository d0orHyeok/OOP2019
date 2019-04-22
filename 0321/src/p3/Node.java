package p3;

public class Node {
	private char island;
	private Node left;
	private Node right;
	
	public Node(char island) {
		this.island = island;
		this.left = null;
		this.right = null;
	}

	public int getIsland() {
		return island;
	}

	public void setIsland(char island) {
		this.island = island;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
