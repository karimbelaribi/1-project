package org.example;

public class Example1 {
    public static void main(String[] args) {
        /*1. Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.*/
        int[] temperatureweek={73,50,26,66,89,87,90};
        int highest=temperatureweek[0];
        int lowest=temperatureweek[0];
        for (int temperature:temperatureweek){
            if (temperature>highest) {
                highest=temperature;


            }if (temperature<lowest){
                lowest=temperature;

            }

        }
        System.out.println(highest);
        System.out.println(lowest);


    }
}
