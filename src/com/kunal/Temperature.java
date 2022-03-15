package com.kunal;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        System.out.println("enter the temperature in celsius !");
        System.out.println("our program will convert it into farehnight");
        Scanner input = new Scanner(System.in);
        float tempc = input.nextFloat();
        float tempf=(tempc * 9/5 )+32;
        System.out.println("temperature in farehnight ="+tempf);
    }
}
