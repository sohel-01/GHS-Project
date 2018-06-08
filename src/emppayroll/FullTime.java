
package emppayroll;



    public class FullTime extends Employee implements IPrintable
    {

		
	private double salary;
	private double bonus;

   public FullTime()
   {
       
   }
        
        
	public double calEarnings() {
		return salary + bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void printMyData() {
		System.out.println(this.getName() 
				+ ""
				+ ""
				+ "");
                
               
	}
	
}

}
