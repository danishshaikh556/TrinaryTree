
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
		if(root == null)
		{
		 root = new Node();
		 root.nodeValue=value;
		 root.leftChild=null;
		 root.rightChild=null;
		 root.middleChild=null;
		 }
		else  root = insert(root,value);
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
private Node root;
}
