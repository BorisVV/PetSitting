package com.BorisV.java;

import java.util.ArrayList;

public class PetManager {

    public static void main(String[] args) {

        //This is the Class that stores the Pet class as array list, then the information in entered
        //and stored in the array Pet.
        ArrayList<Pet> data = new ArrayList<>();
        Pet dayOfWeek= new Pet("Monday: "); //used the instance dayOfWeek to store the day of the week.
        Pet newData = new Pet("Molly","cat","2 time","100 Main Street");
        data.add(newData);  //The data var is the used to add the newdata var to the array.
        newData = new Pet("Nina","dog","2 times","1234 Broad Street");
        data.add(newData);
        newData = new Pet("Bob","parrot","3 times","456 2nd Ave");
        data.add(newData);

        //To keep thing simple I just created separate arrays for each day as you can see on this example.
        ArrayList<Pet> data2 = new ArrayList<>();
        Pet dayOfWeek2 = new Pet("Tuesday: "); //Same as above, I created an instance of dayOfWeek again.
        Pet newData2 = new Pet("Molly", "cat", "2 times", "100 Main Street");
        data2.add(newData2); //Added and stored the new data in the new array list this time called data2.
                            //notice that this is a new array list.
        newData2 = new Pet("Bob","parrot","2 time","456 2nd ave");
        data2.add(newData2);


        int ob = 0;
        dayOfWeek.getDaysOfTheWeek(); //This calls the day of the week before it stars the for loop.
        for (Pet obj : data) {  //for loop works good for me. I am guessing that I could had used a while loop too.
            obj.setInfo();  //This calls the method in Pet class and then prints each line of the array.
            System.out.println();
            ob = ob + obj.splitNumOfTimes();// Since the number of times is in String, I had to split it, I created
                                //a method on Pet class to do this.
            newData.warning(ob);
            //This part calls the warning method, it adds all the times that will be visiting each pet, on each day
            //and prints a warning if number of times is greater than 6. Notice that 2nd array doesn't display a warning.
        }

        //Same sep up us above, just notice the different var to call the methods.
        System.out.println();
        int ob2 = 0;
        dayOfWeek2.getDaysOfTheWeek();
        for (Pet obj : data2) {
            obj.setInfo();
            System.out.println();
            ob2 += obj.splitNumOfTimes();
            newData2.warning(ob2);

        }
    }
}
