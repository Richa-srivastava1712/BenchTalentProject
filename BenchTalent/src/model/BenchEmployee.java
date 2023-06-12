package model;

public class BenchEmployee {

	protected int sapID;
	protected String email;
	protected int is_WPCSpoc;
	protected String password;
	public int getSapID() {
		return sapID;
	}
	public  void setSapID(int sapID) {
		this.sapID = sapID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIs_WPCSpoc() {
		return is_WPCSpoc;
	}
	public void setIs_WPCSpoc(int is_WPCSpoc) {
		this.is_WPCSpoc = is_WPCSpoc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
