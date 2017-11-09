package lab6_part1;

public class Node<T> {
	private T val;
	private Node<T> next;
	public Node () {
		
	}
	public Node (T val) {
		this.val=val;
		this.next=null;
	}
	public void setVal(T val) {
		this.val=val;
	}
	public T getVal() {
		return val;
	}
	public void setNext(Node<T> next) {
		this.next=next;
	}
	public Node<T> getNext(){
		return  next;
	}


}
