package lab9_part1;

public class SortedLinkedList<T extends Comparable<T>> extends LinkedList<T> {
	public boolean add(T target) {
		if (numElements == 0) {
			head = new Node<T>(target);

		} else {
			boolean added = false;
			previous = head;
			location = previous.getNext();
			Node<T> temp = new Node<T>(target);
			if (head.getElement().compareTo(target) > 0) {
				temp.setNext(head);
				head = temp;
			} else {
				while (location != null) {
					if (previous.getElement().compareTo(target) < 0
							&& location.getElement().compareTo(target) > 0) {

						previous.setNext(temp);
						temp.setNext(location);
						added = true;
						break;
					} else {
						previous = location;
						location = location.getNext();
					}
				}
				if (!added) {
					previous.setNext(temp);
				}

			}
		}

		numElements++;
		return true;

	}

}
