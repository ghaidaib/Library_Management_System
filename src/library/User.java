package library;

public class User {

	protected String name;
	protected String phoneNumber;
	protected String email;
	public User() {
		
	}
	public User(String name) {
		
		this.name = name;
	}
	public User(String name, String phoneNumber, String email) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void menu() {

	}
	
}
