
package emppayroll;



    public class Intern extends Employee implements IPrintable {
	
	private String schoolName;
	
//	public Intern(String name,int age,Vehicle veh)
//	{
//	
//	}
	

	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
		System.out.println("Name of Employee :" + this.getName()+" \n Birth Year :" + this.calcBrithYear() + " \n Earnings :" + this.calcEarnings() + "\n Employee has a 'Car' \n Maker of Vehicle :" +this.getVehicle().getMaker() + "\n Vehicle Registration No :" + this.getVehicle().getRegPlate() +"\n Color of Vehcle :" + this.getVehicle().getColor() + "\n Type of Transmission :" + this.getVehicle().getTypeOfTransmission());
		
	}
	
	
}
