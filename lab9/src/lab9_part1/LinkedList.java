package lab9_part1;

public class LinkedList<T extends Comparable<T>> {
	protected Node<T> head;
	protected int numElements;
	protected boolean found;
	protected Node<T> location;
	protected Node<T> previous;

	public LinkedList() {
		head = null;
		numElements = 0;
	}

	public boolean is_full() {
		return false;
	}

	public boolean add(T target) {
		if (numElements == 0) {
			head = new Node<T>(target);

		} else {
			location = head;
			while (location.getNext() != null) {
				location = location.getNext();
			}
			location.setNext(new Node<T>(target));
		}
		numElements++;
		return true;

	}
	public boolean remove(T target) {
		find(target);
		if(found) {
			if(numElements==1) {
				head=null;
			}
			else {
				previous.setNext(location.getNext());
			}
			return true;
		}
		else {
			return false;
		}
	}
	

	protected void find(T target) {
		location = head;
		found = false;
		while (location != null) {
			if (location.getElement().equals(target)) {
				found = true;
				break;
			} else {
				previous = location;
				location = location.getNext();
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb= new StringBuffer();
		location=head;
		while(location!=null) {
			sb.append(location.getElement());
			sb.append("\n");
			location= location.getNext();
		}
		return sb.toString();
	}
	public int size() {
		return numElements;
	}
	

}
