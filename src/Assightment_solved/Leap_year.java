package Assightment_solved;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.println("given year is leap year");
        }
        else
            System.out.println("not a leap20 year");
    }
}
