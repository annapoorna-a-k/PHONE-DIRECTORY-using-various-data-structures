package Phone_Directory;

public class LinkedNode {
	public static Object head;
	private String name;
	private Contact contact;
	private LinkedNode next;

	LinkedNode(String name, Contact contact) {
		this.name = name;
		this.contact = contact;
		next = null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setNext(LinkedNode next) {
		this.next = next;
	}

	public LinkedNode getNext() {
		return this.next;
	}
}