package Assightment_solved;

import java.util.Scanner;

public class no_input_until_x {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            String n = String.valueOf(in.next().trim().charAt(0));

            if (n.equals('x')) {
                break;
            }
            // System.out.println("break");
        }
    }
}
