package com.company;

public class SalaryCalculation {
	public static void totalPay(int hw, double bp){
		double total=0;
			if (bp < 100.00){
				System.out.println("Basepay cannot be smaller than 100.00TL! ");
			}
			else if (hw > 60){
				System.out.println("Working hours cannot be more than 60 hours! ");
			}
			else{
				if (hw<=40){
					total = hw * bp;
					System.out.println("Total salary is: "+ total);
				}
				else if(hw >40){
					total =  ((hw * bp) + ( hw - 40 ) * (1.5 * bp));
					System.out.println("Total salary is: "+ total);
				}
			}
	}

	public static void main(String[] args){
		System.out.println("Employee1 with Basepay:90.50 Hours Worked:35");
		System.out.print("For Employee1 -> ");
		totalPay(35, 90.50);
		System.out.println("Employee2 with Basepay:120.50 Hours Worked:47");
		System.out.print("For Employee2 -> ");
		totalPay(47, 120.50);
		System.out.println("Employee3 with Basepay:150.00 Hours Worked:73");
		System.out.print("For Employee3 -> ");
		totalPay(73,150.00);


	}
}
