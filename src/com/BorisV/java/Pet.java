package com.BorisV.java;

import java.util.ArrayList;

public class Pet {

    private String petName;
    private String type;
    private String numOfTimes;
    private String address;
    private String daysOfTheWeek;
    private ArrayList<String> pets;
    //This are all private. Then I created the constructor below to call this variables.

    public Pet(String petName, String type, String numOfTimes, String address) {
        this.numOfTimes = numOfTimes;
        this.petName = petName;
        this.type = type;
        this.address = address;
        //This is the constructor to call all the variables.
    }

    //Bellow are all the setter and getters methods to call the the values in the variable, for that reason they are
    //public and some of them return values some don't.
    public Pet(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }


    public String getAddress() {
        return address;
    }

//Whatever calls this method has a reference to the Pet object you are calling it for, so you don't need to return the Pet object.
    public void setAddress(String address) {
        this.address = address;

    }

    public String getDaysOfTheWeek() {
        System.out.println(daysOfTheWeek);
        return daysOfTheWeek;
    }

//Same here
    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        System.out.print(daysOfTheWeek);
        
    }

    public String getNumOfTimes() {
        return numOfTimes;
    }

    public void setNumOfTimes(String numOfTimes) {
        this.numOfTimes = numOfTimes;

        //return this; And here
    }

    public String getPetName() {
        return petName;
    }

//TODO Change this one too and the setType method
    public Pet setPetName(String petName) {
        this.petName = petName;
        return this;
    }

    public String getType() {
        return type;
    }

    public Pet setType(String type) {
        this.type = type;
        return this;
    }

    //This the method that I created to print the Pet information in PetManager class.
    public void setInfo() {
        System.out.printf("\tVisit %s" + " the %s" + " %s. Address: %s",getPetName(), getType(), getNumOfTimes(), getAddress());
    }

    //This method if to split and convert the getNumberOfTimes into integers and get the total of times the pets are visited.
    
    public int splitNumOfTimes() {
        String spl = getNumOfTimes();
        String[] split = spl.split(" ");
        String s1 = split[0];
        int numOfTm = Integer.parseInt(s1);
        return numOfTm;
        //This returns the integer of the firts character index of [0].
    }

    //This method is to tell the user that the number of times is more than 6 in one day.
    public void warning(int total) {
        if (total > 6) { //I used the argument var int total, which is from the method splitNumOfTimes when it has calculated
                        //and added all the integers (sum) and prints the warning message if it is over the set point (6).
            System.out.println("Warning! you have more than 6 appointments for today");
        }
    }

//No main method needed, only in the class you'll start the program from.
/*    public static void main(String[] args) {
        //Since I am not using this class, this is left blank. I actually could convert this class to an abstract type class.
    }*/
}
