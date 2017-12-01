package Lists;

/**
 * Implementation of LeakyStack based on CircularLinkedList
 * @author Fernando Gramajo
 *
 * @param <E>
 */
public class ImplLeakyStack<E> {

	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	private int maxSz;
	/**
	 * Sets the max size of the LeakyStack 
	 *
	 * @param topsz Max Size of the LeakyStack
	 */
	public ImplLeakyStack(int topsz)
	{
		maxSz=topsz;
	}

	private Node<E> tail = null;
	
	private int size = 0;
	
	public int size() {return size;}
	
	public boolean isEmpty() { return size == 0;}
	
	public E first() {
		if (isEmpty()) return null;
		return tail.getNext().getElement();//Primer cambio
	}
	
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if (tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E e) {
		
		if(size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);
		}else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	/**
	 * Inserts item at the end of the leakyStack
	 * if max size has been reached it deletes the first item on the leakyStack
	 * @param e Item to be added to LeakyStack
	 */
	public void saveHistory(E e) {
		if(maxSz<1)
		{
			removeFirst();
		}
		addFirst(e);
		tail = tail.getNext();
		maxSz--;
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if(head == tail) tail = null;
		else tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}
