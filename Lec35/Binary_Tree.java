package Lec35;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int left_max = max(nn.left);
		int right_max = max(nn.right);
		return Math.max(nn.val, Math.max(left_max, right_max));

	}

	public boolean search(int item) {
		return search(root, item);
	}

	private boolean search(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = search(nn.left, item);
		boolean right = search(nn.right, item);
		return left || right;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);

	}

	public void INOrder() {
		INOrder(root);
		System.out.println();
	}

	private void INOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}

		INOrder(nn.left);
		System.out.print(nn.val + " ");
		INOrder(nn.right);

	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}

		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");

	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);// add last
		while (!q.isEmpty()) {
			Node n = q.poll();// remove first
			System.out.print(n.val + " ");
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
		System.out.println();
	}
}
