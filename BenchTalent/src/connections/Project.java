
//package connections;
//
//import javax.persistence.Column;
//
//public class Project {
//	
//	private int projectID;
//    private String reqNo; 
//    private String Joining_Level_4;    
//    private String Initiator;
//    private String Pending_With;   
//    private String Primary_Skills;    
//    private String Secondary_Skill;
//    private String Customer;
//    private String Band;
//    private String Sub_band;
//    private String Designation;
//    private String Experience;
//    private String Job_Family;
//    private String Job;
//    private String Job_Description;
//    private String Country;
//    private String Personal_Area;
//    private String Personal_SubArea;
//    
//	
//	
//	public int getProjectID() {
//		return projectID;
//	}
//	public void setProjectID(int projectID) {
//		this.projectID = projectID;
//	}
//	public String getReqNo() {
//		return reqNo;
//	}
//	public void setReqNo(String reqNo) {
//		this.reqNo = reqNo;
//	}
//	public String getJoining_Level_4() {
//		return Joining_Level_4;
//	}
//	public void setJoining_Level_4(String joining_Level_4) {
//		Joining_Level_4 = joining_Level_4;
//	}
//	public String getInitiator() {
//		return Initiator;
//	}
//	public void setInitiator(String initiator) {
//		Initiator = initiator;
//	}
//	public String getPending_With() {
//		return Pending_With;
//	}
//	public void setPending_With(String pending_With) {
//		Pending_With = pending_With;
//	}
//	public String getPrimary_Skills() {
//		return Primary_Skills;
//	}
//	public void setPrimary_Skills(String primary_Skills) {
//		Primary_Skills = primary_Skills;
//	}
//	public String getSecondary_Skill() {
//		return Secondary_Skill;
//	}
//	public void setSecondary_Skill(String secondary_Skill) {
//		Secondary_Skill = secondary_Skill;
//	}
//	public String getCustomer() {
//		return Customer;
//	}
//	public void setCustomer(String customer) {
//		Customer = customer;
//	}
//	public String getBand() {
//		return Band;
//	}
//	public void setBand(String band) {
//		Band = band;
//	}
//	public String getSub_band() {
//		return Sub_band;
//	}
//	public void setSub_band(String sub_band) {
//		Sub_band = sub_band;
//	}
//	public String getDesignation() {
//		return Designation;
//	}
//	public void setDesignation(String designation) {
//		Designation = designation;
//	}
//	public String getExperience() {
//		return Experience;
//	}
//	public void setExperience(String experience) {
//		Experience = experience;
//	}
//	public String getJob_Family() {
//		return Job_Family;
//	}
//	public void setJob_Family(String job_Family) {
//		Job_Family = job_Family;
//	}
//	public String getJob() {
//		return Job;
//	}
//	public void setJob(String job) {
//		Job = job;
//	}
//	public String getJob_Description() {
//		return Job_Description;
//	}
//	public void setJob_Description(String job_Description) {
//		Job_Description = job_Description;
//	}
//	public String getCountry() {
//		return Country;
//	}
//	public void setCountry(String country) {
//		Country = country;
//	}
//	public String getPersonal_Area() {
//		return Personal_Area;
//	}
//	public void setPersonal_Area(String personal_Area) {
//		Personal_Area = personal_Area;
//	}
//	public String getPersonal_SubArea() {
//		return Personal_SubArea;
//	}
//	public void setPersonal_SubArea(String personal_SubArea) {
//		Personal_SubArea = personal_SubArea;
//	}
////	public project(int projectID, String reqNo, String joining_Level_4,
////			String initiator, String pending_With, String primary_Skills,
////			String secondary_Skill, String customer, String band,
////			String sub_band, String designation, String experience,
////			String job_Family, String job, String job_Description,
////			String country, String personal_Area, String personal_SubArea) {
////		this.projectID = projectID;
////		this.reqNo = reqNo;
////		Joining_Level_4 = joining_Level_4;
////		Initiator = initiator;
////		Pending_With = pending_With;
////		Primary_Skills = primary_Skills;
////		Secondary_Skill = secondary_Skill;
////		Customer = customer;
////		Band = band;
////		Sub_band = sub_band;
////		Designation = designation;
////		Experience = experience;
////		Job_Family = job_Family;
////		Job = job;
////		Job_Description = job_Description;
////		Country = country;
////		Personal_Area = personal_Area;
////		Personal_SubArea = personal_SubArea;
////	}
////    
//	
//}
//
//
//
//
//
//
//
//
//
//
////package connections;
////
////import javax.persistence.*;
////
////
////@Entity
////@Table(name = "project")
////public class Project {
////
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    @Column(name = "projectID")
////    private int projectID;
////
////    @Column(name = "reqNo")
////    private String reqNo;
////
////    @Column(name = "Joining_Level_4")
////    private String joiningLevel4;
////
////    @Column(name = "Initiator")
////    private String initiator;
////
////    @Column(name = "Pending_With")
////    private String pendingWith;
////
////    @Column(name = "Primary_Skills")
////    private String primarySkills;
////
////    // Getter and setters
////    public int getProjectID() {
////		return projectID;
////	}
////
////	public void setProjectID(int projectID) {
////		this.projectID = projectID;
////	}
////
////	public String getReqNo() {
////		return reqNo;
////	}
////
////	public void setReqNo(String reqNo) {
////		this.reqNo = reqNo;
////	}
////
////	public String getJoiningLevel4() {
////		return joiningLevel4;
////	}
////
////	public void setJoiningLevel4(String joiningLevel4) {
////		this.joiningLevel4 = joiningLevel4;
////	}
////
////	public String getInitiator() {
////		return initiator;
////	}
////
////	public void setInitiator(String initiator) {
////		this.initiator = initiator;
////	}
////
////	public String getPendingWith() {
////		return pendingWith;
////	}
////
////	public void setPendingWith(String pendingWith) {
////		this.pendingWith = pendingWith;
////	}
////
////	public String getPrimarySkills() {
////		return primarySkills;
////	}
////
////	public void setPrimarySkills(String primarySkills) {
////		this.primarySkills = primarySkills;
////	}
////
////	public String getSecondarySkills() {
////		return secondarySkills;
////	}
////
////	public void setSecondarySkills(String secondarySkills) {
////		this.secondarySkills = secondarySkills;
////	}
////
////	public String getCustomer() {
////		return customer;
////	}
////
////	public void setCustomer(String customer) {
////		this.customer = customer;
////	}
////
////	public String getBand() {
////		return band;
////	}
////
////	public void setBand(String band) {
////		this.band = band;
////	}
////
////	public String getSubBand() {
////		return subBand;
////	}
////
////	public void setSubBand(String subBand) {
////		this.subBand = subBand;
////	}
////
////	public String getDesignation() {
////		return designation;
////	}
////
////	public void setDesignation(String designation) {
////		this.designation = designation;
////	}
////
////	public String getExperience() {
////		return experience;
////	}
////
////	public void setExperience(String experience) {
////		this.experience = experience;
////	}
////
////	public String getJobFamily() {
////		return jobFamily;
////	}
////
////	public void setJobFamily(String jobFamily) {
////		this.jobFamily = jobFamily;
////	}
////
////	public String getJob() {
////		return job;
////	}
////
////	public void setJob(String job) {
////		this.job = job;
////	}
////
////	public String getJobDescription() {
////		return jobDescription;
////	}
////
////	public void setJobDescription(String jobDescription) {
////		this.jobDescription = jobDescription;
////	}
////
////	public String getCountry() {
////		return country;
////	}
////
////	public void setCountry(String country) {
////		this.country = country;
////	}
////
////	public String getPersonalArea() {
////		return personalArea;
////	}
////
////	public void setPersonalArea(String personalArea) {
////		this.personalArea = personalArea;
////	}
////
////	public String getPersonalSubArea() {
////		return personalSubArea;
////	}
////
////	public void setPersonalSubArea(String personalSubArea) {
////		this.personalSubArea = personalSubArea;
////	}
////
////	@Column(name = "Secondary_Skills")
////    private String secondarySkills;
////
////    @Column(name = "Customer")
////    private String customer;
////
////    @Column(name = "Band")
////    private String band;
////
////    @Column(name = "Sub_band")
////    private String subBand;
////
////    @Column(name = "Designation")
////    private String designation;
////
////    @Column(name = "Experience")
////    private String experience;
////
////    @Column(name = "Job_Family")
////    private String jobFamily;
////
////    @Column(name = "Job")
////    private String job;
////
////    @Column(name = "Job_Description")
////    private String jobDescription;
////
////    @Column(name = "Country")
////    private String country;
////
////    @Column(name = "Personal_Area")
////    private String personalArea;
////
////    @Column(name = "Personal_SubArea")
////    private String personalSubArea;
////
////	public Project(int projectID, String reqNo, String joiningLevel4,
////			String initiator, String pendingWith, String primarySkills,
////			String secondarySkills, String customer, String band,
////			String subBand, String designation, String experience,
////			String jobFamily, String job, String jobDescription,
////			String country, String personalArea, String personalSubArea) {
////		super();
////		this.projectID = projectID;
////		this.reqNo = reqNo;
////		this.joiningLevel4 = joiningLevel4;
////		this.initiator = initiator;
////		this.pendingWith = pendingWith;
////		this.primarySkills = primarySkills;
////		this.secondarySkills = secondarySkills;
////		this.customer = customer;
////		this.band = band;
////		this.subBand = subBand;
////		this.designation = designation;
////		this.experience = experience;
////		this.jobFamily = jobFamily;
////		this.job = job;
////		this.jobDescription = jobDescription;
////		this.country = country;
////		this.personalArea = personalArea;
////		this.personalSubArea = personalSubArea;
////	}
////    
////    
////
////    // constructors, getters, and setters
////}

