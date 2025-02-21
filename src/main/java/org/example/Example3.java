package org.example;

public class Example3 {
    public static void main(String[] args) {
        /*3. Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even numbers
        only*/
        int[][] numbers={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        for (int[]row:numbers){ /*array {123}*/
            for (int  num:row){
                if (num%2==0){
                    System.out.print(num+",");
                }


            }
        }



    }
}
