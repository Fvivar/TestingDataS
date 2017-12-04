package BST;

import Lists.Position;

public class BinarySearchTree<E> {
	private int sz=0;
	public Node<E> R=null;
	
	public Node<E> CreateNode(E e)
	{
		Node<E> newNode= new Node<E>(e);
		return newNode;
	}
	/**
	 * Inserts Node to BST
	 * @param root
	 * @param n
	 */
	public void Insert(Node<E> root,Node<E> n)
	{
		if(sz!=0)
		{
			if ((int)n.getElement() < (int)root.getElement())
	        {
	            if (root.getLeft() == null)
	            {
	            	n.parent=root;
	                root.left= n;
	                sz++;
	            }
	            else
	            {
	                Insert(root.getLeft(), n);
	                //Add recursive call for insert void
	            }
	        }
			else
	        {
	            if ((int)n.getElement() > (int)root.getElement())
	            {
	                if (root.getRight()== null)
	                {
	                	n.parent=root;
	                    root.right = n;
	                    sz++;
	                }
	                else
	                {
	                    Insert(root.getRight(),n);
	                    //Add recursive call for insert void
	                }
	            }
	        }
		}
		if(sz==0)
		{
			R=n;
			sz++;
		}
	}
	private Node<E> searchNode(E value, Node<E> root)
	{
		Node<E> foundNode=null;
	    if(root != null)
	    {
	    	if(root.getElement().equals(value))
	    	{
	           return foundNode= root;
	    	}
	    	if ((int)value < (int)root.getElement())
	        {
		    	return searchNode(value, root.getLeft());
	        }
		    if ((int)value > (int)root.getElement())
	        {
		    	return searchNode(value, root.getRight());
	        }
	    } 
	    
		return foundNode;
        
     }
	private void setValue(E value, Node<E> root, E nValue)
	{
	    if(root != null)
	    {
	    	if(root.getElement().equals(value))
	    	{
	           root.SetVal(nValue);
	    	}
	    	if ((int)value < (int)root.getElement())
	        {
		    	searchNode(value, root.getLeft());
	        }
		    if ((int)value > (int)root.getElement())
	        {
		    	searchNode(value, root.getRight());
	        }
	    }  
     }
	
	private Node<E> getMin(Node<E> l)
	{
		if (l.getLeft()==null) 
		{
			return l;
		}
		else
		{
			getMin(l.getLeft());
		}
		return l;
	}
	
	public Node<E> remove(E p)  
	{
		Node<E> f = searchNode(p,R);
		
		if ((f.getLeft()!=null)&&(f.getRight()!=null))
		{
			//In case node to remove has 2 childNodes
			Node<E> aux = getMin(f.getRight());
			setValue(p, R, aux.getElement());
			return aux.parent.left=null;
		}
		if ((f.getLeft()==null)&&(f.getRight()==null))
		{
			//In case node to remove has no childNodes
			if(f.parent.getLeft()==p)
			{
				return f.parent.left=null;
			}
			if(f.parent.getRight()==p)
			{
				return f.parent.right=null;
			}
		}
		if ((f.getLeft()!=null)&&(f.getRight()==null))
		{
			//In case node to remove has 1 childNode (left)
			return f.parent.left=f.left;
		}
		if ((f.getLeft()==null)&&(f.getRight()!=null))
		{
			//In case node to remove has 1 childNode (right)
			return f.parent.right=f.right;
		}
		sz--;
		return f;
		
	}

}
