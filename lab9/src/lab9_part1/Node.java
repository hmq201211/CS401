package lab9_part1;

public class Node<E> {
	protected E element;
	protected  Node<E> next;
	public Node(E element) {
		this.element=element;
		next=null;
	}
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	

}
