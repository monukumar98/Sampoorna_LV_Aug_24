package Lec38;

public class Binary_Tree_Cameras {
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
		int Camera = 0;

		public int minCameraCover(TreeNode root) {
			minCamera(root);
			return Camera;
		}

		public int minCamera(TreeNode root) {
			if (root == null) {
				return 0;// covered hai ye
			}
			int l = minCamera(root.left);
			int r = minCamera(root.right);
			if (l == -1 || r == -1) {// left ya right me se koi bhi ek jaana camera ka requirement kra to camera setup krna hoga as parent
				Camera++;
				return 1;// mere pe camera hai
			} else if (l == 1 || r == 1) {// left ya right me se koi bhi ek jaana ye bol diya camera hai iska mtlb mei covered hu

				return 0;// mere pe camera hai
			} else {// both child covered hai only kisi pe bhi camera nhi hai nahi hi requirement
					// hai
				return -1; // camera ka requirement hai
			}

		}

	}

}
