
package emppayroll;


public class CommissionBasedPartTime extends PartTime implements IPrintable{
	
	private int commissionPercent;
	
	public double calEarnings() {
		double ear = super.getRate() * super.getHoursWorked();
		double com = ear*(commissionPercent/100);
		return ear+com;
//		return (super.getRate() * super.getHoursWorked())  
	}

	@Override
	public void printMyData() {

		
	}

}
