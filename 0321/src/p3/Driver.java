package p3;

public class Driver {
	public static void main(String[] args) {
		Node rootnode = new Node('H');
		Node f = new Node('F');
		Node s = new Node('S');
		Node u = new Node('U');
		Node e = new Node('E');
		Node z = new Node('Z');
		Node k = new Node('K');
		Node n = new Node('N');
		Node a = new Node('A');
		Node y = new Node('Y');
		Node t = new Node('T');
		
		Tree.makeLeftSubTree(rootnode, f);
		Tree.makeRightSubTree(rootnode, s);
		Tree.makeLeftSubTree(f, u);
		Tree.makeRightSubTree(f, e);
		Tree.makeLeftSubTree(s, z);
		Tree.makeRightSubTree(s, k);
		Tree.makeLeftSubTree(u, n);
		Tree.makeLeftSubTree(e, a);
		Tree.makeRightSubTree(a, t);
		Tree.makeRightSubTree(k, y);
		
		System.out.println("코스 1");
		Tree.preorderTraverse(rootnode);
		
		System.out.println("\n코스 2");
		Tree.inorderTraverse(rootnode);
		
		System.out.println("\n코스 3");
		Tree.postorderTraverse(rootnode);
	}
}
