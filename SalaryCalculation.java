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
					System.out.println("Total is: "+ total);
				}
				else if(hw >40){
					total =  ((hw * bp) + ( hw - 40 ) * (1.5 * bp));
					System.out.println("Total is: "+ total);
				}
			}
	}

	public static void main(String[] args){
		totalPay(35, 90.50);
		totalPay(47, 120.50);
		totalPay(73,150.00);
	}
}
