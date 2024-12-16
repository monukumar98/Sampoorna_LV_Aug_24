package Lec38;

public class Maximum_Sum_BST_in_Binary_Tree {

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
		public int maxSumBST(TreeNode root) {
			return ValidBST(root).ans;
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
			sbstp.sum = lbstp.sum + rbstp.sum + root.val;// complete tree ka sum
			sbstp.isBST = lbstp.isBST && rbstp.isBST && lbstp.max < root.val && root.val < rbstp.min;
			if (sbstp.isBST) {
				sbstp.ans = Math.max(sbstp.sum, Math.max(lbstp.ans, rbstp.ans));
			} else {
				sbstp.ans = Math.max(lbstp.ans, rbstp.ans);
			}
			return sbstp;

		}

		class BSTPair {
			boolean isBST = true;
			Long min = Long.MAX_VALUE;
			Long max = Long.MIN_VALUE;
			int sum = 0;// complete tree ka sum
			int ans = 0;// only maximum sum of bst
		}
	}

}
