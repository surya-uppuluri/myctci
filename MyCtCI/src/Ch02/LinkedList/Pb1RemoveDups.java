package Ch02.LinkedList;

import java.util.Random;

public class Pb1RemoveDups {

	public static void main(String[] args) {
	/*	SingleLinkedList listBasic = new SingleLinkedList();
		listBasic.append(4);
		for (int i = 0; i < 8; i++)
			listBasic.append(i % 2);
		listBasic.append(4);
		listBasic.traverse();
		listBasic.removeDups();
		listBasic.traverse();
		listBasic.removeDupsUsingHashSet();
		listBasic.traverse();
		listBasic.removeUsingKey(0);
		listBasic.traverse();*/
		DoubleLinkedList dll = new DoubleLinkedList();
		for (int i = 0; i < 5; i++)
			dll.append(i % 2);
			dll.traverse();
			dll.push(8);
			System.out.println();
			dll.traverse();
			System.out.println();
			dll.removeDups();
			dll.traverse();
			System.out.println();

	}
}
