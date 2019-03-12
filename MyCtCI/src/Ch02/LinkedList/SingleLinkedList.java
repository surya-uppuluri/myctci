package Ch02.LinkedList;

import java.util.HashSet;

public class SingleLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public void traverse() {
		if (head == null) {
			System.out.println("Empty list");
		}
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
		System.out.println();
	}

	public int countNodesIteratively() {
		Node cNode = head;
		int count = 0;
		while (cNode != null) {
			count++;
			cNode = cNode.next;
		}
		return count;
	}

	public void insertAfter(Node prevNode, int newData) {

		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public void push(int i) {
		Node newNode = new Node(i);
		newNode.next = head;
		head = newNode;
	}

	public void append(int i) {
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public void deleteWithKey(int key) {
		Node prev = head;

		try {
			if (head.data == key) {
				head = head.next;
				return;
			}
			while (prev.next.data != key) {
				prev = prev.next;
			}
			prev.next = prev.next.next;
		} catch (NullPointerException n) {
			System.out.println("Specified key is not found in the list");
		}
	}

	public void deleteList() {
		head = null;

	}

	public void recursiveLength() {
		System.out.println(getCount(head));

	}

	private int getCount(Node node) {
		try {
			if (node == null)
				return 0;
			else
				return 1 + getCount(node.next);

		} catch (NullPointerException n) {
			System.out.println("List is empty");
		}
		return 0;
	}

	public int iterativeLength() {
		try {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("Iterative length: " + count);
			return count;
		} catch (NullPointerException n) {
			System.out.println("List is Empty");

		}
		return -1;

	}

	public boolean searchIteraive(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key) {
				return true;
			} else {
				temp = temp.next;
			}
		}
		return false;
	}

	public boolean searchRecursive(int key) {
		return search(head, key);
	}

	private boolean search(Node node, int key) {
		if (node == null)
			return false;
		if (node.data == key)
			return true;
		return search(node.next, key);

	}

	public int getNthRecursively(int pos) {
		try {
			return getNth(head, pos);
		} catch (NullPointerException n) {
			System.out.println("R-Index supplied: " + pos + " is out of range");
		}
		assert (false);
		return -1;
	}

	private int getNth(Node node, int pos) {
		int count = 0;
		if (count == pos)
			return node.data;
		else
			return getNth(node.next, pos - 1);

	}

	public int getNthNodeIteratively(int i) {
		try {
			Node temp = head;
			if (i > getCount(temp) || i < 0) {
				throw new NullPointerException();
			}
			int tempCount = 0;
			while (tempCount < i) {
				temp = temp.next;
				tempCount++;
			}
			return temp.data;

		} catch (NullPointerException e) {
			System.out.println("Index supplied: " + i + " is out of range");
		}
		assert (false);
		return 0;
	}

	public int getNthFromReverse(int n) {
		return getNthNodeIteratively(iterativeLength() - n);
	}

	public void removeDups() {
		Node node1, node2=null;
		node1=head;
		while(node1!=null && node1.next!=null)
		{
			node2=node1;
			while(node2!=null && node2.next!=null)
			{
				if(node1.data==node2.next.data)
				{
					node2.next=node2.next.next;
					System.gc();
				}
				else
					node2=node2.next;
			}
			node1=node1.next;
		}
	}

	public void removeDupsUsingHashSet() {
		HashSet<Integer> hashSet = new HashSet<>();
		Node node1=head; Node prev = null;
		while(node1!=null)
		{
			if(hashSet.contains(node1.data))
			{
				prev.next=node1.next;
			}
			else
			{
				hashSet.add(node1.data);
				prev=node1;
			}
			node1=node1.next;
		}
		
		
	}

	public void removeUsingKey(int key) {
		Node node = head;
		Node prev=null;
		while(node!=null) {
			if(node.data==key)
			{
				prev.next = node.next;
				System.out.println("Removing "+ key);
				node=node.next;
			}
			else
			{
				prev=node;
				node=node.next;
			}
		}
		
	}
}