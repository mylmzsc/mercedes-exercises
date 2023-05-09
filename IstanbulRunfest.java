package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void fastest1(Integer[] given){
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
        System.out.println("Fastest runner's index is: " +indexOfFast);
        System.out.println("He/She ran for: "+ lowestTime +" minutes");

        //System.out.println("Second Fastest runner's index is: " +indexOfSecondFast);
        //System.out.println("He/She ran for: "+ secondLowest +" minutes");

    }
    public static void fastest2(Integer[] given){
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
        //System.out.println("Fastest runner's index is: " +indexOfFast);
        //System.out.println("He/She ran for: "+ lowestTime +" minutes");

        System.out.println("Second Fastest runner's index is: " +indexOfSecondFast);
        System.out.println("He/She ran for: "+ secondLowest +" minutes");

    }
    public static void main(String[] args) {
        //Integer[] ty = new Integer[] {8,1,4,3,6,3,7};
        //fastest(ty);
        String nums;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide the minutes of runners by entering a space between numbers: ");
        nums = sc.nextLine();
        int tt = 0;

        String[] nums1 = nums.split(" ");
        Integer[] nums2 = new Integer[nums1.length];

        for (int y =0 ;y < nums1.length; y ++){
             tt = Integer.parseInt(nums1[y]);
             nums2[y] = tt;
        }
        fastest1(nums2);
        fastest2(nums2);

        sc.close();



    }
}
