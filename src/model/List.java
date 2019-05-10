package model;

public class List {
	
	private Node first;
	
	public List(Node first) {
		this.setFirst(first);
	}
	
	public void addRecursively(Node toAdd, Node current) {
		if(first == null) {
			setFirst(toAdd);
		} else { 
			if(current.getNext() != null) {
				addRecursively(toAdd, current.getNext());
			} else {
				current.setNext(toAdd);			
			}
		}
	}
	
	public String toString() {
		Node temp = first;
		String s = "";
		while(temp != null) {
			s+= temp.getValue() + " ";
			temp = temp.getNext();
		}
		return s;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}
	
}
