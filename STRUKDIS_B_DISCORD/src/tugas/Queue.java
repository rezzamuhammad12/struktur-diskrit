package tugas;

import java.util.Scanner;

public class Queue {
	private Node FRONT;
	private Node REAR;

	public void enque(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}

	public boolean isEmpty() {
		if (FRONT == null) {
			return true;
		} else
			return false;
	}

	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while (curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}

	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}

	public void dequeue() {
		Node temp;
		if (isEmpty()) {
			System.out.println("Elemen Queue Kosong");
		} else {
			temp = FRONT;
			FRONT = FRONT.getNext();
			dispose(temp);
		}
	}

	private void dispose(Node temp) {
		temp = null;
	}

	public void displayElement() {
		Node curNode = FRONT;
		if (curNode == null) {
			System.out.println("Elemen Queue kosong");
		} else {
			System.out.print("Elemen Queue : ");
			while (curNode != null) {
				System.out.print(curNode.getData() + " ");
				curNode = curNode.getNext();
			}
			System.out.println();
		}
	}

	public void cari(int elemen) {
		Node curNode = FRONT;
		boolean ketemu = false;

		while (curNode != null && ketemu == false) {
			if (curNode.getData() == elemen) {
				ketemu = true;
			} else {
				curNode = curNode.getNext();
			}
		}
		if (ketemu == true) {
			System.out.println("Elemen " + curNode.getData() + " ditemukan");
		} else {
			System.out.println("Elemen yang dicari tidak ditemukan");
		}
	}
}
