
public class Main {

	public static void main(String[] args) {
		BST_Class a = new BST_Class();
		a.insert(45);
		a.insert(10);
		a.insert(7);
		a.insert(12);
		a.insert(90);
		a.insert(50);
		System.out.println("The BST Created with input data(Left-Root-Right)");
		a.InOrder();
		System.out.println();
		System.out.println("The BST after Delete 12(leaf node)");
		a.deleteKey(12);
		a.InOrder();
		System.out.println();
		System.out.println("The BST after delete 90(node with 1 child)");
		a.deleteKey(90);
		a.InOrder();
		System.out.println();
		System.out.println("The BST after delete 45(node with 2 children)");
		a.deleteKey(45);
		a.InOrder();
		System.out.println();
		System.out.println("Key 50 found in BST: "+a.search(50));
		System.out.println("Key 12 found in BST: "+a.search(12));
		BST_Class b = new BST_Class();
		b.insert(45);
		b.insert(10);
		b.insert(7);
		b.insert(12);
		b.insert(90);
		System.out.println("BST => PreOrder Traversal:");
		b.PreOder();
		System.out.println();
		System.out.println("BST => InOrder Traversal:");
		b.InOrder();
		System.out.println();
		System.out.println("BST => PostOrder Traversal:");
		b.PostOrder();
	}

}
