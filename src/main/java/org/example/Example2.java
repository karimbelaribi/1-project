package org.example;

public class Example2 {
    public static void main(String[] args) {
        /* Create an array of integer values. After the array is created, calculate the
        sum of all stored elements in that array.*/
        int[] value={2,4,8,25,64,32,43,91};
        int sum=0;
        for (int number:value){
            sum+=number;


        }

        System.out.println(sum);
    }
}
