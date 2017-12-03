package DataStructures;
/**
 * ArrayStack Implementation
 * Works almost as a Stack
 * @author Fernando Gramajo
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY=1000;
	private E[] data;
	private int t=-1;
	/**
	 * Constructor for ArrayStack
	 */
	public ArrayStack() {
		this(CAPACITY);
	}
/**
 * Constructor for ArrayStack with size param
 * @param capacity Size of ArrayStack
 */
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size(){
		return t+1;
	}

	public boolean isEmpty() {
		return (t == -1);
	}

	public void push(E e) {
		if(t==(data.length-1))
		{
			resize(2*data.length);
		}
		data[++t] = e;
		
	}

	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}

	public E pop() {
		if (isEmpty()) return null;
		E response = data[t];
		data[t] = null;
		t--;
		return response;
	}
	/**
	 * Internal method to increase array capacity
	 * @param capacity
	 */
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k <= t; k++)
			temp[k] = data[k];
		data = temp;
	}
	
	

}
