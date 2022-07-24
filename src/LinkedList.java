package Phone_Directory;

import java.util.*;

//import javax.mail.internet;
class LinkedList {
	LinkedNode head;

	LinkedList() {
		head = null;
	}

	public void insertAtLast(String name, Contact contact) {
		LinkedNode object = new LinkedNode(name, contact);
		if (head == null) 
		{
			head = object;
		} 
		else 
		{
			LinkedNode temp = head;
			while (temp.getNext() != null) 
			{
				temp = temp.getNext();
			}
			temp.setNext(object);
		}
	}

	public void insetAtMiddle(String name, Contact contact)
	{
		LinkedNode object = new LinkedNode(name, contact);
		LinkedNode temp = head;
		if (temp == null) 
		{
			object.setName(name);
			object.setContact(contact);
			head = object;
			return;
		}
		while (temp.getName().compareTo(name) < 0)
		{
			if (temp.getNext() == null)
				break;
			temp = temp.getNext();
		}
		object.setNext(temp.getNext());
		temp.setNext(object);
	}

	public TreeMap<String, Contact> updatedData() {
		LinkedNode temp = head;
		TreeMap<String, Contact> updatedData = new TreeMap<String, Contact>();
		while (temp != null) {
			// System.out.println(temp.getName());
			updatedData.put(temp.getName(), temp.getContact());
			temp = temp.getNext();
		}
		return updatedData;
	}
}
