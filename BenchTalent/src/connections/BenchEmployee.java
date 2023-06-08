//package connections;
//
//import javax.persistence.*;
//
//
//
///*
// * 
// * Persistence class for the benchemployee data table
// * 
// */
//@Entity
//@Table(name ="benchemployee")
//public class BenchEmployee {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "sapID")
//	private int sapID;
//	
//	
//	@Column(name = "email")
//	private  String email;
//	
//	
//	@Column(name = "is_WPCSpoc")
//	private boolean is_WPCSpoc;
//	
//	
//	@Column(name = "password")
//	private String password;
//
//
//	public int getSapID() {
//		return sapID;
//	}
//
//
//	public void setSapID(int sapID) {
//		this.sapID = sapID;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	public boolean isIs_WPCSpoc() {
//		return is_WPCSpoc;
//	}
//
//
//	public void setIs_WPCSpoc(boolean is_WPCSpoc) {
//		this.is_WPCSpoc = is_WPCSpoc;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public BenchEmployee(int sapID, String email, boolean is_WPCSpoc,
//			String password) {
//		super();
//		this.sapID = sapID;
//		this.email = email;
//		this.is_WPCSpoc = is_WPCSpoc;
//		this.password = password;
//	}
//		
//	
//	
//	
//
//}
