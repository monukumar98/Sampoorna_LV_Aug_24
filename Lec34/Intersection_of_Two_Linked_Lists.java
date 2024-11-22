package Lec34;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode Devansh = headA;
			ListNode Devansh_V_GF = headB;
			while (Devansh != Devansh_V_GF) {
				if (Devansh == null) {
					Devansh = headB;
				} else {
					Devansh = Devansh.next;
				}
				if (Devansh_V_GF == null) {
					Devansh_V_GF = headA;

				} else {
					Devansh_V_GF = Devansh_V_GF.next;
				}
			}
			return Devansh_V_GF;
		}
	}
}
