package com.company;

public class range {
    private int firstyear;
    private int secondyear;
    private int range;
    private int firstdivisor;
    private int seconddivisor;

    public range(int x, int y){
        this.firstyear=x;
        this.secondyear=y;
    }

    public void setRangeType(int x){this.range=x;}
    public void setFirstdivisor(int x){this.firstdivisor=x;}
    public void setSeconddivisor(int y){this.seconddivisor=y;}
    public int getFirstdivisor(){return this.firstdivisor;}
    public int getSeconddivisor(){return this.seconddivisor;}
    public int getFirstyear(){return this.firstyear;}
    public int getSecondyear(){return this.secondyear;}
    public void printYears(){
        while(firstyear<=secondyear){
            firstyear++;
            if(firstyear%firstdivisor==0 && firstyear%seconddivisor==0)
                System.out.println(firstyear);
        }

    }
    public void printLeap(){
        while(firstyear<=secondyear){
            firstyear++;
            if(firstyear%firstdivisor==0)
                System.out.println(firstyear);
        }
    }
    public void printOlympic(){
        while(firstyear<=secondyear){
            firstyear++;
            if(firstyear % firstdivisor == 0)
                System.out.println(firstyear);
        }
    }
}
