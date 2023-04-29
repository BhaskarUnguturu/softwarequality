package softwarequality;

public class StudentService {
	private Studentfees studentFees;
	private StudentDetails studentDetails;
	

public StudentService(Studentfees studentFees, StudentDetails studentDetails) {
	this.studentFees = studentFees;
	this.studentDetails = studentDetails;
}

public void payingFees(int amount, int UID) {
	int status = 0;
	Student s = studentDetails.fetchStudentDetails(UID);
	if(s == null) {
		throw new IllegalArgumentException("Cannot find UID ");
	}
	else {
		status =studentFees.payStudentFee(UID, s.getStudentName(), amount);
		if (status == 0) {
			System.out.println("payment failed" + UID);
		}
		else {
			System.out.println("payment success" + UID);
		}
	}
	
}

public double seeAvilableBalance(int UID) {
	int status = studentDetails.validAccount(UID);
	if(status == 0) {
		throw new IllegalArgumentException("Cannot find UID ");
	}
	else {
		double fees = studentFees.fetchAvialableFee(UID);
		return fees;
	}
	
}


}

