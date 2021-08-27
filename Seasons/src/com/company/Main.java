package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setRangeType(1);
        myFirstRange.setFirstDivisor(14);
        myFirstRange.setSecondDivisor(20);

    //Get all leap years.(4)
        YearRange mySecondRange=new YearRange(1100,3150);
        mySecondRange.setRangeType(2);

    //Get all Olympic years (divisible by 3)
        YearRange myThirdRangeType=new YearRange(1500,1890);
        myThirdRange.setRangeType(3);

        System.out.println("List of all years divisible between" +myFirstRange.getFirstDivisor() + "and"+ myFirstRange.getSecondDivisor());
                myFirstRange.printYears();
    }
}
