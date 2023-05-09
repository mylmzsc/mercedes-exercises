package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void fastest1(Integer[] given, String[] names){
		int lowestTime = given[0], indexOfFast = 0, indexOfSecondFast = 100,secondLowest= given[1];
		int current;

		for(int k =0; k < given.length ;k++){
			current = given[k];
			if(current < lowestTime){
				secondLowest = lowestTime;
				lowestTime = current;
				indexOfFast = k;
			}
		}
		for(int kk =0; kk < given.length ;kk++){
			if(given[kk] == secondLowest)
				indexOfSecondFast = kk;
		}
		System.out.println("Fastest runner's names is: " + names[indexOfFast]);
		System.out.println("He/She ran for: "+ lowestTime +" minutes");

		//System.out.println("Second Fastest runner's index is: " +indexOfSecondFast);
		//System.out.println("He/She ran for: "+ secondLowest +" minutes");

	}
	public static void fastest2(Integer[] given, String[] names){
		int lowestTime = given[0], indexOfFast = 0, indexOfSecondFast = 100,secondLowest= given[1];
		int current;

		Integer[] given2 = given;
		Arrays.sort(given2);
		secondLowest = given2[1];

		for(int kk =0; kk < given.length ;kk++){
			if(given[kk] == secondLowest)
				indexOfSecondFast = kk;
		}

		System.out.println("Second Fastest runner's name is: " + names[indexOfSecondFast]);
		System.out.println("He/She ran for: "+ given2[1] +" minutes");

	}
	public static void main(String[] args) {
		//Integer[] ty = new Integer[] {8,1,4,3,6,3,7};
		//fastest(ty);
		String nums,names;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide the name list of runners with {name1,name2.. } format: ");
		names = sc.nextLine();
		System.out.print("Please provide the minutes of runners with {min1,min2.. } format: ");
		nums = sc.nextLine();

		int tt = 0;

		nums = nums.substring(1, nums.length() - 1);
		names = names.substring(1, names.length() - 1);

		String[] nums1 = nums.split(",");
		String[] names1 = names.split(",");

		Integer[] nums2 = new Integer[nums1.length];

		for (int y =0 ;y < nums1.length; y ++){
			tt = Integer.parseInt(nums1[y]);
			nums2[y] = tt;
		}
		fastest1(nums2,names1);
		fastest2(nums2,names1);

		sc.close();
		//trial data {Ibrahim,Berke,Metin,İrem,Yigit,Melis} {272,479,278,329,445,402}

	}
}
