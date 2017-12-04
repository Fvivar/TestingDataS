package BST;


public class Node<E> {

	private E element;
	public Node<E> parent=null;
	public Node<E> left;
	public Node<E> right;
	public Node(E e) {
		super();
		this.element = e;
		this.parent=null;
		this.left=null;
		this.right=null;
	}
	public E getElement() {
		return element;
	}
	public Node<E> getLeft() {
		return left;
	}
	public Node<E> getRight() {
		return right;
	}
	public void SetVal(E q)
	{
		element=q;
	}
}
