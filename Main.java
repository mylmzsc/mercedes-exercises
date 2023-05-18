package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  //MoreThanHundredAndTenException and NegativeAgeException .java files are needed !
  public static void validate(int age) throws Exception {
	if(age < 0){
	  throw new NegativeAgeException("Age cannot be negative! ");
	}
	else if(age >110){
	  throw new MoreThanHundredAndTenException("Age cannot be more than 110! ");
	}
	else if (age >= 18 && age < 60) {
	  System.out.println("Valid age has been entered!");
	}
  }

  public static void main(String[] args) {

	String names;
	int nums;
	Scanner sc = new Scanner(System.in);
	try {
	  System.out.print("Please provide the name: ");
	  names = sc.nextLine();
	  System.out.println();

	  System.out.print("Please provide the age: ");
	  nums = sc.nextInt();
	  System.out.println();
	  validate(nums);

	} catch (InputMismatchException e) {
		System.out.println("Wrong input type! Please enter the type 'Integer'.");
	} catch (Exception e) {
	  //e.printStackTrace();
	  System.out.println(e.getMessage());
	} finally{
	  sc.close();
	}

  }
}