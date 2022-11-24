import java.util.*;
class AP8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float finalPay=0, overTime=0;
		System.out.print("Enter the hours worked by the Employee: ");
		int hoursWorked = sc.nextInt();
		System.out.print("Enter the base Pay of the Employee: ");
		float basePay = sc.nextFloat();
		if (hoursWorked>60) {
			System.err.println("Hours Worked should be less than 60");
		}else if(basePay<8){
			System.out.println("Base Pay cannot be less than 8$");
		}else if(hoursWorked<=40){
			finalPay = hoursWorked*basePay;
		}else if (hoursWorked>40) {
			overTime=(hoursWorked-40);
			hoursWorked-=overTime;
			finalPay = (basePay*hoursWorked)+(overTime*(basePay*(1.5f)));
		}
		if (finalPay>0) {
			System.out.println("Final Salary is: "+finalPay);	
		}
		

	}
}