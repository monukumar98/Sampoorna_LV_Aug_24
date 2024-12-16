package Lec38;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

		}

		public TreeNode Create(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode n = new TreeNode(pre[plo]);
			int idx = Search(in, ilo, ihi, pre[plo]);
			int c = idx - ilo;
			n.left = Create(pre, in, plo + 1, plo + c, ilo, idx - 1);
			n.right = Create(pre, in, plo + c + 1, phi, idx + 1, ihi);
			return n;
		}

		private int Search(int[] in, int ilo, int ihi, int item) {
			// TODO Auto-generated method stub
			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}

	}
}
