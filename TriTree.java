
public class TriTree {
	
	//Constructor for tree
	public TriTree()
	{
		// root =new Node();
		 root =null;
	}
	
	//Wrapper Class 
	public void insertInTree(int value)
	{
		root = insert(root,value);
	}
		
		
	private Node insert(Node start, int value)
	{
		if(start==null)
		{
			start=new Node();
			start.nodeValue=value;
			start.leftChild=null;
			start.middleChild=null;
			start.rightChild=null;
		
	   }
		else if(start.nodeValue == value) start.middleChild = insert(start.middleChild,value);
		else if (start.nodeValue < value) start.rightChild =insert(start.rightChild,value);
		else if (start.nodeValue > value) start.leftChild=insert(start.leftChild,value);
		
		return start;
	}
			
	public void inOrder()
	{
		printInOrder(root);
	}
	
	private void printInOrder(Node nodeToPrint)
	{
		if(nodeToPrint != null)
		{
			printInOrder(nodeToPrint.leftChild);
			System.out.println(nodeToPrint.nodeValue);
			printInOrder(nodeToPrint.middleChild);
			printInOrder(nodeToPrint.rightChild);
		}
	}
	
	public void delete()
	{
		postOrder(root);
	}
	
	private void postOrder(Node finish)
	{
		if(finish != null)
		{
			postOrder(finish.leftChild);
			postOrder(finish.middleChild);
			postOrder(finish.rightChild);
			System.out.println("Deleted" + finish.nodeValue);
			finish=null;
		}
	}
private Node root;
}
