package Tree;
import java.util.*;
public class BinaryTree {
	
	class Node {
		int val ;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc =new Scanner(System.in);
	public BinaryTree() {
		root =CreateTree();
	}
	private Node CreateTree() {
		int item =sc.nextInt();
		Node nn =new Node();
		nn.val=item;
		boolean hlc =sc.nextBoolean();
		if(hlc) {
			nn.left=CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right=CreateTree();
		}
		
		return nn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Display(Node nn) {
		String s="";
		s="<--"+nn.val +"-->";
		if(nn.left !=null) {
			s=nn.left.val + s;
			
		}
		else {
			s="."+s;
		}
		if(nn.right !=null) {
			s=s+nn.right.val;
		}
		else {
			s=s+".";
		}
		System.out.println(s);
	}

}
