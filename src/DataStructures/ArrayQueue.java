package DataStructures;

/**
 * ArrayQueue Implementation
 * Works almost as a Queue
 * @author Fernando Gramajo
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
	public static final int CAPACITY=1000;
	private E[] data;
	private int f = 0; //Index for front element
	private int sz = 0; //Curent qty
	/*
	 * Constructor for ArrayQueue
	 */
	public ArrayQueue( ) {
		this(CAPACITY);
	}
/**
 * Constructor for ArrayQueue with size param
 * @param capacity Size of ArrayQueue
 */
	public ArrayQueue(int capacity) {
		data = (E[ ]) new Object[capacity];
	}
	
	public int size(){
		return sz;
	}
	
	public boolean isEmpty() {
		return (sz == 0);
	}
	
	public void enqueue(E e) {
		if(sz==data.length)
		{
			resize(2*data.length);
		}
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}
	
	public E first( ) {
		if (isEmpty()) return null;
		return data[f];
	}
	
	public E dequeue( ) {
		if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
	/**
	 * Internal method to increase array capacity
	 * @param capacity
	 */
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < sz; k++)
			temp[k] = data[k];
		data = temp;
	}
}
