package Phone_Directory;

public class Contact {
	private String Address;
	private String Mobile;
	private String Email;

	Contact() {
		Address = null;
		Mobile = null;
		Email = null;
	}

	Contact(String Group, String Address, String Mobile, String Email) {
		this.Address = Address;
		this.Mobile = Mobile;
		this.Email = Email;
	}

	public void setGroup(String group) {
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getAddress() {
		return this.Address;
	}

	public void setMobile(String Mobile) {
		this.Mobile = Mobile;
	}

	public String getMobile() {
		return this.Mobile;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getEmail() {
		return this.Email;
	}
}