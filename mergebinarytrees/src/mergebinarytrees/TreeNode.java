package mergebinarytrees;

public class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode (int x) {
		val = x;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}
	
	public int getVal() {
		return val;
	}

}
