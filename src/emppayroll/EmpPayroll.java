package emppayroll;

public class EmpPayroll {

    public static void main(String[] args) {
    
        
        
        Intern i1 = new Intern();
		i1.setAge(23);i1.setName("Caio");i1.setSchoolName("lambton");i1.setEarnings(1200);
		
		i1.printMyData();
		System.out.println("=========================================");
		
		FullTime ft1 = new FullTime();
		Car vh = new Car();
		ft1.setName("Andy");ft1.setAge(35);ft1.setVehicle(vh);ft1.setSalary(4700.00);ft1.setBonus(570.00);
		vh.setMaker("B M W X6");vh.setRegPlate("ABC 123");vh.setTypeOfTransmission("Manual");
		vh.setColor("Blue");
		
		ft1.printMyData();
		System.out.println("=========================================");
		CommissionBasedPartTime cb1 = new CommissionBasedPartTime();
		Car vh2 = new Car();
		cb1.setName("Ellen");cb1.setAge(22);cb1.setVehicle(vh2);cb1.setRate(30);cb1.setHoursworked(10);cb1.setCommissionPercent(15);
		vh2.setMaker("Toyota");vh2.setRegPlate("CDE 456");vh2.setTypeOfTransmission("Automatic");vh2.setColor("Black");
		cb1.printMyData();
		
		System.out.println("=========================================");
		
		FixedBasedPartTime fpt1 = new FixedBasedPartTime();
		Motorcycle mt1 = new Motorcycle();
		fpt1.setName("Bob");fpt1.setAge(30);fpt1.setVehicle(mt1);mt1.setMaker("Harley DavidSon");mt1.setRegPlate("XYZ 000");mt1.setTypeOfTransmission("Manual");
		mt1.setColor("Black");fpt1.setRate(10);fpt1.setHoursworked(20);fpt1.setFixedAmount(75);
		fpt1.printMyData();
    }
    
}
