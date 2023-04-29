package softwarequality;

public class Student {
	
	private int studentID;
	private String studentName;
	private String sex;
	private String country;
	
	public Student(int studentID, String studentName, String sex, String country) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.sex = sex;
		this.country = country;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	} 
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", sex=" + sex + ", country="
				+ country + "]";
	}
}
