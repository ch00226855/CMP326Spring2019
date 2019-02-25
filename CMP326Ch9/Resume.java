
public class Resume {
	
	// Question: What needs to be changed if we want the inner classes to be private?
	public class PersonalInfo{
		
		public String name;
		public String address;
		public String phone;
		public String email;
		
	}
	
	public class Education {
		
		public String schoolName;
		public String schoolType;
		public String startDate;
		public String endDate;
	}
	
	public class Work {
		
		public String companyName;
		public String position;
		public String startDate;
		public String endDate;
	}
	
	
	public PersonalInfo pInfo;
	public Education[] edus;
	public Work[] works;
	
	public Resume() {
		edus = new Education[10];
		works = new Work[20];
	}
	
	public void addPersonalInfo(PersonalInfo pInfo) {
		this.pInfo = pInfo;
	}
	
	// When PersonalInfo class is private, use the following method instead
//	public void addPersonalInfo(String name, String address, String phone, String email) {
//		PersonalInfo pInfo = new PersonalInfo();
//		pInfo.name = "Liang";
//		pInfo.address = "somewhere in New York";
//		pInfo.phone = "my phone number";
//		pInfo.email = "my email";
//		this.pInfo = pInfo;
//	}
	
	public void addEducation(Education edu, int index) {
		edus[index] = edu;
	}
	
	public void addWork(Work work, int index) {
		works[index] = work;
	}
	

}
