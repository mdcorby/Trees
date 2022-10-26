class Node{
	int data;
	Node left, right;
	
	public Node(int a) {
		data = a;
		left = null;
		right = null;
	}
}

public class BST_Class {

	Node root;
	
	//make BST with node root
	public BST_Class(){
		root=null;
	}
	
	//make BST with root a
	public BST_Class(Node a) {
		root = a;
	}
	
	public void insert(int a) {
		root = insert_recursive(a,root);
	}
	
	private Node insert_recursive(int a , Node start) {
		if (start==null) {
			start = new Node(a);
			return start;
		}
		if (a<start.data) {
			start.left=insert_recursive(a, start.left);
		}
		if (a>=start.data) {
			start.right=insert_recursive(a,start.right);
		}
		return start;
	}
	
	public void PostOrder() {
		postorder_recursive(root);
	}
	
	private void postorder_recursive(Node a) {
		if(a.left!=null) {
			postorder_recursive(a.left);
		}
		if(a.right!=null) {
			postorder_recursive(a.right);
		}
		System.out.print(a.data+" ");
	}
	
	public void InOrder() {
		inorder_recursive(root);
	}
	
	private void inorder_recursive(Node a) {
		if(a.left!=null) {
			inorder_recursive(a.left);
		}
		System.out.print(a.data+" ");
		if(a.right!=null) {
			inorder_recursive(a.right);
		}
	}
	
	public void PreOder() {
		preorder_recursive(root);
	}
	
	private void preorder_recursive(Node a) {
		System.out.print(a.data+" ");
		if(a.left!=null) {
			preorder_recursive(a.left);
		}
		if(a.right!=null) {
			preorder_recursive(a.right);
		}
	}
	
	public boolean search(int key) {
		return recursivesearch(key, root);
	}
	
	private boolean recursivesearch(int k, Node start) {
		if(start==null) {
			return false;
		}else if(start.data==k) {
			return true;
		}else if(k<start.data) {
			return recursivesearch(k,start.left);
		}
		return recursivesearch(k,start.right);
	}
	
	public int minValue() {
		return minValue(root);
	}
	
	private int minValue(Node a) {
		while(a.left!=null) {
			a=a.left;
		}
		return a.data;
	}
	
	public void deleteKey(int k) {
		recdelete(k,root);
	}
	
	private Node recdelete(int k, Node s) {
		if(this.search(k)==false) {
			return s;
		}
		
		
		if(k<s.data) {
			s.left=recdelete(k,s.left);
		}
		if(k>s.data) {
			s.right=recdelete(k,s.right);
		}
		if(k==s.data) {
			//no children
			if(s.left==null) {//right child
				return s.right;
			}else if(s.right==null) {//left child
				return s.left;
			}
			
			
			//two children
			//switch Node with smallest to the right and delete it
			s.data=minValue(s.right);
			s.right=recdelete(s.data,s.right);
		}
		return s;
	}
}
