package com.company;

public class Main {

            public static void main(String args[]){
//Get all years divisible by 14 and 20
            range myFirstRange = new range(1314, 2014); myFirstRange.setRangeType(1);
            myFirstRange.setFirstdivisor(14);
            myFirstRange.setSeconddivisor(20);
//Get all leap years.
            range mySecondRange = new range(1100, 3150); mySecondRange.setRangeType(2);
            mySecondRange.setFirstdivisor(4);
//Get all Olympic years divisible by 3
            range myThirdRange = new range(1500, 1890); myThirdRange.setRangeType(3);
            myThirdRange.setRangeType(3);
            myThirdRange.setFirstdivisor(3);


            System.out.println("List of all years divisible by" +
                    myFirstRange.getFirstdivisor() + " and " +
                    myFirstRange.getSeconddivisor());
            myFirstRange.printYears();
            System.out.println("List of all leap years between" +
                    mySecondRange.getFirstyear() + " and " +
                    mySecondRange.getSecondyear());
            mySecondRange.printLeap();
            /*System.out.println("List of all years divisible by" +
                    myThirdRange.getFirstdivisor() + "and" +
                    myThirdRange.getSeconddivisor());
            myThirdRange.printYears();*/
            System.out.println("List of all Olympic years between" +
                    myThirdRange.getFirstyear() + " and " + myThirdRange.getSecondyear() +
"that are divisible by " + myThirdRange.getFirstdivisor());
            myThirdRange.printOlympic();
        }
    }

