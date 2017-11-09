package lab6_part1;

public class LinkedListStack<T> {
	private Node<T> top;

	public LinkedListStack() {
		top = null;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	public void push(T val) {
		if (isFull()) {
			throw new StackOverflowException("the stack is full");
		}
		Node<T> node = new Node<T>(val);
		node.setNext(top);
		top = node;
	}

	public void pop() {
		if (isEmpty()) {
			throw new StackUnderflowException("the stack is empty");
		}
		top=top.getNext();
	}
	public T peek(){
		if (isEmpty()) {
			throw new StackUnderflowException("the stack is empty");
		}
		return top.getVal();
	}

}
