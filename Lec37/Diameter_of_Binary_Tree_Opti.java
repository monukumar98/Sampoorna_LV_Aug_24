package Lec37;

public class Diameter_of_Binary_Tree_Opti {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return Diameter(root).dt;
		}

		public DiaPair Diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = Diameter(root.left);
			DiaPair rdp = Diameter(root.right);
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;// ht
			int sd = ldp.ht + rdp.ht + 2;
			sdp.dt = Math.max(sd, Math.max(ldp.dt, rdp.dt));// diameter
			return sdp;

		}

		class DiaPair {
			int dt = 0;
			int ht = -1;
		}
	}

}
