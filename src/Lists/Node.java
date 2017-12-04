package Lists;


public class Node<E> {

	private E element;
	public Node<E> prev;
	public Node<E> next;
	public Node(E e) {
		super();
		this.element = e;
		this.prev=null;
		this.next=null;
	}
	public E getElement() {
		return element;
	}
	
	public Node<E> getNext() {
		return next;
	}
	public void SetVal(E q)
	{
		element=q;
	}
}
