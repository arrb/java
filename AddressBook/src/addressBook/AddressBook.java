package addressBook;

public class AddressBook {
	private String name;
	private String address;
	private String telNo;
	private String email;
	
	public AddressBook(){
		name = "";
		address = "";
		telNo = "";
		email = "";
	}
	public AddressBook(String name, String address, String telNo, String email){
		this.name = name ; 
		this.address = address; 
		this.telNo = telNo; 
		this.email = email ;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}
	/**
	 * @param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
}
