package com.kunal;

import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//          auto matic casting input= 60 (int value)
//          output= 60.0
         float num = input.nextFloat();
        System.out.println(num);
//       TYPE CASTING EXPLICITLY
        int a= (int)(99.44f);
    }
}
