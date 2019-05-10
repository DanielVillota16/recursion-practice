package ui;

import model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(2);
		Node n1 = new Node(3);
		Node n2 = new Node(4);
		n.setNext(n1);
		n1.setNext(n2);
		List l = new List(n);
		l.addRecursively(new Node(9), l.getFirst());
		System.out.println(l);
	}

}
