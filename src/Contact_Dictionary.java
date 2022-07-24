package Phone_Directory;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Contact_Dictionary {
	// HashMap contact
	static TreeMap<String, Contact> contact;
	// Br is use to fetch data from the file
	BufferedReader br;

	// initialize value from the file
	Contact_Dictionary() throws IOException {
		contact = new TreeMap<String, Contact>();
		File newfile = new File("contact_Main.csv");
		if (newfile.createNewFile()) {
			System.out.println("File created: " + newfile.getName());
		}

		try {
			br = new BufferedReader(new FileReader(newfile));
			String str = new String();
			while ((str = br.readLine().toString()) != null) {
				String[] data = str.split("-");
				Contact obj = new Contact();
				obj.setAddress(data[1]);
				obj.setMobile(data[2]);
				obj.setEmail(data[3]);
				contact.put(data[0], obj);
			}
			br.close();
		} catch (Exception e) {
			return;
		}
	}

	public static String filtername(String prefix) { // Trie Functionality is used for the searching by the name
														// prefix...
		Trie objc = new Trie();
		for (String key : contact.keySet()) {
			objc.addWord(key);
		}
		String ansfilter = "";
		List<String> display = objc.search(prefix);
		// int i = 0;
		if (display != null) {
			for (String str : display) {
				Contact a = contact.get(str);
				ansfilter = ansfilter + "\n" + str + "-" + a.getMobile() + "-" + a.getAddress() + "-" + a.getEmail();
			}
			ansfilter = ansfilter.replaceAll("(?m)^[ \t]*\r?\n", "");
			return ansfilter;
		} else {
			return null;
		}
	}

	public TreeMap<String, Contact> fetchData() {
		BufferedReader br;
		TreeMap<String, Contact> newcontact = new TreeMap<String, Contact>();
		try {
			br = new BufferedReader(new FileReader("contact_Main.csv"));
			System.out.println("Open Successfully");
			String str = new String();
			while ((str = br.readLine().toString()) != null) {
				String[] data = str.split("-");
				Contact obj = new Contact();
				obj.setAddress(data[1]);
				obj.setMobile(data[2]);
				obj.setEmail(data[3]);
				newcontact.put(data[0], obj);
			}
			br.close();
		} catch (Exception e) {
			return newcontact;
		}
		return newcontact;
	}

	// Delete Key Done
	public static void deleteData(String name) {
		contact.remove(name);
		return;
	}

	// Insert DOne
	public static void insertData(String name, String number, String address, String emailid) {
		LinkedList obj = new LinkedList();
		boolean flag = true;
		for (Map.Entry<String, Contact> a : contact.entrySet()) 
		{
			if (a.getKey().compareTo(name) == 0)
			{
				flag = false;
				break;
			}
			obj.insertAtLast(a.getKey(), a.getValue());
		}
		if (flag == true) 
		{
			if (address.compareTo("") == 0)
				address = "NA";
			if (emailid.compareTo("") == 0)
				emailid = "NA";
			Contact newContact = new Contact();
			newContact.setAddress(address);
			newContact.setEmail(emailid);
			newContact.setMobile(number);
			obj.insetAtMiddle(name, newContact);
			contact = obj.updatedData();
			return;
		}
	}

	public static void exportData() {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("contact_Main.csv"));
			for (Map.Entry<String, Contact> ob : contact.entrySet()) {
				String str = new String();
				str = ob.getKey() + "-" + ob.getValue().getAddress() + "-" + ob.getValue().getMobile() + "-"
						+ ob.getValue().getEmail();
				bw.write(str);
				bw.newLine();
			}
		} catch (Exception e) {
			return;
		}
		try {
			bw.close();
		} catch (Exception e) {
			return;
		}
	}

	public static boolean checkcontact(String name) {
		Contact updatecontact = contact.get(name);
		if (updatecontact == null) {
			return false;
		} else {
			return true;
		}
	}

	public static void updatephone(String name, String num) {
		Contact updatecontact = contact.get(name);
		if (updatecontact == null) {
			return;
		} else 
		{
			updatecontact.setMobile(num);
		}
		exportData();
		return;
	}

	public static void updateaddress(String name, String add) {
		Contact updatecontact = contact.get(name);
		if (updatecontact == null) {
			return;
		} else {
			updatecontact.setAddress(add);
		}
		exportData();
		return;
	}

	public static void updatemail(String name, String email) {
		Contact updatecontact = contact.get(name);
		if (updatecontact == null) {
			return;
		} else {
			updatecontact.setEmail(email);
		}
		exportData();
		return;
	}
}