package Ch02.LinkedList;

public class DoubleLinkedList {

	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;

		}
	}

	public void main(String[] args) {

	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;

		if (head != null) {
			head.prev = newNode;
		}

		head = newNode;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (temp == null) {
			head = newNode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void removeDups() {
		Node node1 = head, node2;
		while (node1.next != null) {
			node2 = node1;
			while (node2.next != null) {
				if (node1.data == node2.next.data) {
					node1.next = node2.next;
				}
				node2 = node2.next;
			}
			node1 = node1.next;
		}

	}

}
