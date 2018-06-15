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
	cb1.setName("Ellen");cb1.setAge(22);cb1.setVehicle(vh2);cb1.setRate(30);cb1.setHoursWorked(10);cb1.setCommissionPercent(15);
	vh2.setMaker("Toyota");vh2.setRegPlate("CDE 456");vh2.setTypeOfTransmission("Automatic");vh2.setColor("Black");
	cb1.printMyData();
		
	System.out.println("=========================================");
		
	FixedBasedPartTime fpt1 = new FixedBasedPartTime();
	Motorcycle mt1 = new Motorcycle();
	fpt1.setName("Bob");fpt1.setAge(30);fpt1.setVehicle(mt1);mt1.setMaker("Harley DavidSon");mt1.setRegPlate("XYZ 000");mt1.setTypeOfTransmission("Manual");
	mt1.setColor("Black");fpt1.setRate(10);fpt1.setHoursWorked(20);fpt1.setFixedAmount(75);
	fpt1.printMyData();
             
        System.out.println("========================================="); 
        
        Intern i2 = new Intern();
        Car vh3 = new Car();
        i2.setAge(21);i2.setName("Nick");i2.setSchoolName("Cestar College");i2.setEarnings(1500);
        i2.setVehicle(vh3);vh3.setColor("White");vh3.setMaker("Toyota");vh3.setRegPlate("AAA 776");vh3.setTypeOfTransmission("Automatic");
		
	i2.printIntern2();
	System.out.println("=========================================");
		
	FullTime ft2 = new FullTime();
	Car vh4 = new Car();
	ft2.setName("Karthik");ft2.setAge(31);ft2.setVehicle(vh4);ft2.setSalary(6200.00);ft2.setBonus(400.00);
	vh.setMaker("Audi S6");vh.setRegPlate("KRT 313");vh.setTypeOfTransmission("Manual");
	vh.setColor("Brown");
		
	ft2.printMyData();
        
	System.out.println("=========================================");
        
	CommissionBasedPartTime cb2 = new CommissionBasedPartTime();
	Car vh5 = new Car();
	cb2.setName("Andrew");cb2.setAge(27);cb2.setVehicle(vh5);cb2.setRate(27);cb1.setHoursWorked(35);cb2.setCommissionPercent(18);
	vh5.setMaker("Hundai");vh5.setRegPlate("AND 780");vh5.setTypeOfTransmission("Automatic");vh5.setColor("Black");
	cb2.printMyData();
		
	System.out.println("=========================================");
		
	FixedBasedPartTime fpt2 = new FixedBasedPartTime();
	Motorcycle mt2 = new Motorcycle();
	fpt2.setName("Emma");fpt2.setAge(23);fpt2.setVehicle(mt2);mt2.setMaker("BMW");mt2.setRegPlate("EMA 901");mt2.setTypeOfTransmission("Manual");
	mt2.setColor("RED");fpt2.setRate(15.5);fpt2.setHoursWorked(36);fpt2.setFixedAmount(115);
	fpt2.printMyData();
                
                
                
                
                
                
    }
    
}
