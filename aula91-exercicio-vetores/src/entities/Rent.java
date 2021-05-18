package entities;

public class Rent {

	private String name;
	private String mail;

	public Rent(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

		public String toString() {
		return "Nome: " 
		+ name 
		+ ", email: " 
		+ mail;
		
	}
}
