package org.example;

public class Example4 {
    public static void main(String[] args) {
        /*4. Create a 2D array of integers. Develop a program which will calculate the
        sum of even and odd numbers for that array.*/
        int[][] numbers={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int sumEven=0;
        int sumOdd=0;
        for (int[]row:numbers){
            for (int value:row){
                if (value%2==0){
                    sumEven+=value;

                }else {
                    sumOdd+=value;
                }
            }


        }

        System.out.println(sumEven);
        System.out.println(sumOdd);


    }
}
