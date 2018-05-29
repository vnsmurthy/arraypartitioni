package mergebinarytrees;

public class Solution {
	
	public TreeNode addTwoNodes(TreeNode tree1, TreeNode tree2) {
		TreeNode node = null;				
		if (tree1 != null || tree2 != null) {
			node = new TreeNode(0);
			node.val = tree1 != null ? tree1.val : 0;
			int val2 = tree2 != null ? tree2.val : 0;			
			node.val += val2;
		} 
		return node;
	}
	
	public TreeNode merge (TreeNode tree1, TreeNode tree2) {
		TreeNode tree = addTwoNodes(tree1, tree2);
		if (tree1 != null && tree2 != null) {
			tree.left = merge(tree1.left, tree2.left);
			tree.right = merge(tree1.right, tree2.right);
		} else if (tree1 != null) {
			tree.left = merge(tree1.left, null);
			tree.right = merge(tree.right, null);
		} else if (tree2 != null) {
			tree.left = merge(null, tree2.left);
			tree.right = merge(null, tree2.right);			
		} else {
			return tree;
		}
		return tree;
	}
	
		
	public void printTree(TreeNode tree) {
		if(tree == null) {
			return;
		}
		System.out.println(tree.val);
		printTree(tree.left);
		printTree(tree.right);
	}
	
	public static void main(String args[]) {
		Solution s = new Solution();
		
		TreeNode tree1 = new TreeNode(1);
		tree1.setRight(new TreeNode(2));
		TreeNode a = new TreeNode(3);
		a.setLeft(new TreeNode(5));
		tree1.setLeft(a);
		s.printTree(tree1);
		System.out.println();
		
		TreeNode tree2 = new TreeNode(2);
		TreeNode b = new TreeNode(1);
		b.setRight(new TreeNode(4));
		TreeNode c = new TreeNode(3);
		c.setRight(new TreeNode(7));
		tree2.setLeft(b);
		tree2.setRight(c);
		s.printTree(tree2);
		System.out.println();
		
		TreeNode mergedTree = s.merge(tree1, tree2);
		s.printTree(mergedTree);
		
	}

}
