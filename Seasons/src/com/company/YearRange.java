package com.company;

public class YearRange {

    public int getSecondDivisor(){return secondDivisor;}
    public void setSecondDivisor(int secondDivisor){this.getSecondDivisor=secondDivisor;}

    public void printYears(){
        List<Integer>range_number=new ArrayList<>();
        int count=3000;
        for(int x=0; x<count;x++){
            int add_year = firstYear+x;
            range_number.add(add_year);
            if(add_year==secondYear){
                break;
            }
        }
        divisibleBy14and20(range_number);
    }

    public void divisibleBy14and20(List<Integer>range_number){
        for(int x=0;x<range_number.size();x++){
            if(range_number.get(x)%14)+(range_number.get(x)%20)==0){
                System.out.println(range_number.get(x))
            }
        }
    }
}
