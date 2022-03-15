package LOOP;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().trim().charAt(0);
       // char b = input.next().trim().charAt(0);
        if (a>='a' && a<='z')
            System.out.println("lower case" +" "+ a);
        if (a>='A' && a<= 'Z')
        System.out.println("upper case" +" "+ a);
      //  System.out.println("noob");
    }
}
