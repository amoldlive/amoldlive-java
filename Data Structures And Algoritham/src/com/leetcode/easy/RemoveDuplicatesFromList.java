package com.leetcode.easy;

public class RemoveDuplicatesFromList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		if (curr == null) {
			return null;
		}
		
		ListNode mainPointer = new ListNode(0);
		ListNode dummyPointer = mainPointer;
		
		while (curr.next != null) {
			if (curr.next.val != curr.val) {
				dummyPointer.next = new ListNode(curr.val);
				dummyPointer = dummyPointer.next;
			}
			curr = curr.next;
		}
		dummyPointer.next = new ListNode(curr.val);

		return mainPointer.next;
	}

}
