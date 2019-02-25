
public class ResumeDemo {

	public static void main(String[] args) {
		// Create a resume
		Resume myResume = new Resume();
		
		// Create a PersonalInfo
		Resume.PersonalInfo pInfo = myResume.new PersonalInfo();
		pInfo.name = "Liang";
		System.out.println("Name for personal info: " + pInfo.name);
		pInfo.address = "somewhere in New York";
		pInfo.phone = "my phone number";
		pInfo.email = "my email";
		
		myResume.addPersonalInfo(pInfo);
		
		// This is how you pass in personal info when PersonalInfo class is private. 
//		myResume.addPersonalInfo("liang", "my address", "my phone", "my email");
		
		// Retrieve personal info from myResume
		Resume.PersonalInfo retrievedInfo = myResume.new PersonalInfo();
		retrievedInfo = myResume.pInfo;
		System.out.println("Name from retrievedInfo: " + retrievedInfo.name);
		
		// Create an education experience
		Resume.Education college = myResume.new Education();
		college.schoolName = "Lehman College";
		college.schoolType = "Undergraduate";
		college.startDate = "September 4 years ago";
		college.endDate = "last June";
		
		myResume.addEducation(college, 0);
		
		// Print out the college education from myResume (dont use the object college)
		System.out.println(myResume.edus[0].schoolName);
		System.out.println(myResume.edus[0].schoolType);
		System.out.println(myResume.edus[0].startDate);
		System.out.println(myResume.edus[0].endDate);
		
		
		System.out.println("So far so good.");

	}

}
