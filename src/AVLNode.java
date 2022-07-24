package Phone_Directory;

public class AVLNode {
	AVLNode left = null;
	AVLNode right = null;
	Contact contact;
	String name;
	int height = 0;

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public AVLNode(String name, Contact contact) {
		this.contact = contact;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Contact getContact() {
		return this.contact;
	}
}
