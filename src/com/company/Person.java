package com.company;

public class Person {

    public int stepHeight;
    public int stepLength;
    public int runLimit;
    public int jumpLimit;
    public boolean checkRun;
    public boolean checkJump;

    public Person(int stepHeight, int stepLength, int runLimit, int jumpLimit){
        this.stepHeight = stepHeight;
        this.stepLength = stepLength;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean jump(){

        this.jumpLimit--;
        if (this.jumpLimit >= 0) {
            System.out.println("Person Jumped successfully...");
            this.checkRun = true;
            return this.checkRun;
        }
        return this.checkRun;
    }
    public int run(){
        this.runLimit -= 50;
        if (this.runLimit >= 0) {
            System.out.println("Person Ran successfully...");
        }
        return  this.runLimit;
    }
}
