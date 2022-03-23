package Assightment_solved;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int table = in.nextInt();
        for (int i = 1; i <= 10; i++) {
           // int i1 = table * i;
            System.out.println("table of given number = " + (table * i));
        }
    }
}
