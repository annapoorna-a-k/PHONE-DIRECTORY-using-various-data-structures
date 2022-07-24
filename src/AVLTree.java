package Phone_Directory;

public class AVLTree {//AVLTree class
	private static AVLNode root;
	static String ans;

	AVLTree() {//constructor
		root = null;
	}

	public boolean isEmpty() {
		return AVLTree.root == null ? true : false;
	}

	public void makeEmpty() {
		AVLTree.root = null;
	}

	public void insert(String name, Contact contact) {//insert method
		root = insert(name, contact, root);
	}

	public AVLNode insert(String name, Contact contact, AVLNode node)
	{
		//insert method (recursive) inserts a node into the tree and returns the new root
		if (node == null) 
		{
			node = new AVLNode(name, contact);
		} 
		else if (name.compareTo(node.getName()) < 0) 
		{
			//if the name is less than the current node's name
			node.left = insert(name, contact, node.left);
			//insert the node to the left of the current node (recursive call)
			if (this.getHeight(node.left) - this.getHeight(node.right) > 1) 
			{
				//if the left subtree is taller than the right subtree by more than 1
				if (name.compareTo(node.right.name) < 0)
					//if the name is less than the right node's name
					node = this.rotateLeft(node);//rotate the node to the left
				else
				{
					node = this.doublerotateLeft(node);//rotate the node to the left twice
				}
			}
		} 
		else if (name.compareTo(node.getName()) > 0) 
		{
			//if the name is greater than the current node's name
			node.right = insert(name, contact, node.right);
			//insert the node to the right of the current node (recursive call)
			if (this.getHeight(node.right) - this.getHeight(node.left) == 2) 
			{
				//if the right subtree is taller than the left subtree by 2
				if (name.compareTo(node.left.name) > 0)
				{
					//if the name is greater than the left node's name
					node = this.rotateLeft(node);//rotate the node to the left
				}
				else
				{
					node = this.doublerotateRight(node);//rotate the node to the right twice
				}
			}
		}
		return node;
	}

	public AVLNode doublerotateLeft(AVLNode A1) {//rotate the node A1 to the right then to the left
		A1.left = this.rotateRight(A1.left);//rotate the left subtree of A1 to the right and assign it to A1.left
		return this.rotateLeft(A1);// rotate A1 to the left and return the new root
	}

	public AVLNode doublerotateRight(AVLNode A1) { //rotate the node A1 to the left then to the right
		A1.right = this.rotateLeft(A1.right);//rotate the right subtree of A1 to the left and assign it to A1.right
		return this.rotateRight(A1);// rotate A1 to the right and return the new root
	}

	public AVLNode rotateRight(AVLNode A1) {//rotate the node A1 to the right
		AVLNode A2 = A1.right; //assign the right subtree of A1 to A2
		A1.right = A2.left; //assign the left subtree of A2 to A1.right
		A2.left = A1; //assign A1 to A2.left
        //set the height of A1 and A2 to the max of the heights of its right and left subtrees + 1 (the height of the new root)
		A1.setHeight(this.getMax(this.getHeight(A1.right), this.getHeight(A1.left)) + 1); 
		A2.setHeight(this.getMax(this.getHeight(A2.right), this.getHeight(A2.left)) + 1);
		return A2;
	}

	public AVLNode rotateLeft(AVLNode A1) { //rotate the node A1 to the left
		AVLNode A2 = A1.left; //assign the left subtree of A1 to A2
		A1.left = A2.right; //assign the right subtree of A2 to A1.left
		A2.right = A1; //assign A1 to A2.right
		//set the height of A1 and A2 to the max of the heights of its right and left subtrees + 1 (the height of the new root)
		A1.setHeight(this.getMax(this.getHeight(A1.right), this.getHeight(A1.left)) + 1);
		A2.setHeight(this.getMax(this.getHeight(A2.right), this.getHeight(A2.left)) + 1);
		return A2;
	}

	public int getHeight(AVLNode n) {
		return n == null ? -1 : n.getHeight();//if n is null return -1 else return the height of n
	}

	public int getMax(int right, int left) {
		return right > left ? right : left;//if right is greater than left return right else return left
	}

	/* find by Name */
	public static void findByName(String name) { //finds a node by name
		AVLNode temp = root;
		temp = findByName(name, temp); //recursive call to find the node 
	}

	public static AVLNode findByName(String name, AVLNode node) { //finds a node by name (recursive)
		if (node != null) {
			findByName(name, node.left); //recursive call to the left subtree of the current node 
			if (name.compareTo(node.getName()) == 0) {  //if the name is equal to the current node's name
				printAll(node.getName(), node.getContact()); //gets the node's name and contact
			}
			findByName(name, node.right); //recursive call to the right subtree of the current node 
		}
		return node;
	}

	/* Find by Address */
	public void findByAddress(String Add) {
		AVLNode temp = root;
		temp = this.findByAddress(Add, temp);
	}

	public AVLNode findByAddress(String Add, AVLNode node) {
		if (node != null) {
			this.findByAddress(Add, node.left);

			if (Add.compareTo(node.getContact().getAddress()) == 0) {
				printAll(node.getName(), node.getContact());
			}
			this.findByAddress(Add, node.right);
		}
		return node;
	}

	/* Find by Mobile */
	public static void findByMobile(String contact) {
		AVLNode temp = root;
		temp = findByMobile(contact, temp);
	}

	private static AVLNode findByMobile(String contact, AVLNode node) {
		if (node != null) {
			findByMobile(contact, node.left);
			if (contact.compareTo(node.getContact().getMobile()) == 0) {
				printAll(node.getName(), node.getContact());
				return node;
			}
			findByMobile(contact, node.right);
		}
		return node;
	}

	// Find by Email
	public void findByEmail(String email) {
		AVLNode temp = root;
		temp = this.findByEmail(email, temp);
	}

	private AVLNode findByEmail(String email, AVLNode node) {
		if (node != null) {
			this.findByEmail(email, node.left);
			if (email.compareTo(node.getContact().getEmail()) == 0) {
				printAll(node.getName(), node.getContact());
				// return node;
			}
			this.findByEmail(email, node.right);
		}
		return node;
	}

	// Printing Data
	public static void printAll(String name, Contact contact) { //returns all data of a node	
		ans = name + "-" + contact.getMobile() + "-" + contact.getAddress() + "-" + contact.getEmail();
	}
}
