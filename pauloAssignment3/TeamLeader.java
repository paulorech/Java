package pauloAssignment3;

public class TeamLeader extends ConstructionWorker{
	
	double monthlyBonus;
	double reqTraining;
	double trainingAtt;

	//constructor with the required fields and inheriting the other parameters from construction worker class 
	//including the exceptions created in Employee and constructionWorker classes.
	public TeamLeader(String name, String eNumber, String hDate, int shift, double hourlyPayRate, double monthlyBonus,
			double reqTraining, double trainingAtt) throws InvalidEmpNumberException, InvalidShiftException {
		super(name, eNumber, hDate, shift, hourlyPayRate);
		this.monthlyBonus = monthlyBonus;
		this.reqTraining = reqTraining;
		this.trainingAtt = trainingAtt;
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public double getReqTraining() {
		return reqTraining;
	}

	public void setReqTraining(double reqTraining) {
		this.reqTraining = reqTraining;
	}

	public double getTrainingAtt() {
		return trainingAtt;
	}

	public void setTrainingAtt(double trainingAtt) {
		this.trainingAtt = trainingAtt;
	}
	
	// method overridden from constructionworker class, 
	//added 3 items: monthly bonus, required training and training attended.
	@Override
	public String toString() {
		return  "Team Leader: " + "\n" + 
				"Employee Name: " + super.getName() + "\n" + 
				"Employee Number: " + super.getENumber() + "\n" + 
				"Hiring Date: " + super.getHDate()+ "\n" + 
				"Shift: " + super.getShift() + "\n" + 
				"Hourly Pay Rate: " + super.getHourlyPayRate() + "\n" +
				"Monthly Bonus: " + this.getMonthlyBonus() + "\n" +
				"Required Training: " + this.getReqTraining() + " hours" + "\n" +
				"Training Attended: " + this.getTrainingAtt() + " hours" + "\n";
	}
	
	
	
	

}
