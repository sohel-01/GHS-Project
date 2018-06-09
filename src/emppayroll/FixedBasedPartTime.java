package emppayroll;


public class FixedBasedPartTime extends PartTime implements IPrintable{
	
	private double fixedAmount;
	
	public double calcEarnings() {
		
		double ear = super.getRate() * super.getHoursWorked();
		double com = ear*(fixedAmount/100);
		return ear+com;
	}

	

	public void setFixedAmount(double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}



	@Override
	public void printMyData() {
	
		
	}
	
	
}
