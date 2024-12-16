package Lec38;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isBST;
		}

		public BSTPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}
			BSTPair lbstp = ValidBST(root.left);
			BSTPair rbstp = ValidBST(root.right);
			BSTPair sbstp = new BSTPair();
			sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
			sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
			sbstp.isBST = lbstp.isBST && rbstp.isBST && lbstp.max < root.val && root.val < rbstp.min;
			return sbstp;

		}

		class BSTPair {
			boolean isBST = true;
			Long min = Long.MAX_VALUE;
			Long max = Long.MIN_VALUE;
		}
	}

}
