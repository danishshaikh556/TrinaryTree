import java.util.Scanner;


public class Trimain {
	
	public static void main(String[] args)
	{
		TriTree dani=new TriTree();
		
		Scanner in =new Scanner(System.in);
		while(true)
		{
			int a =in.nextInt();
			if (a==0) break;
			dani.insertInTree(a);
		}
		dani.inOrder();
	}

}
