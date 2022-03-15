package LOOP;

import java.util.Scanner;

public class largest_no_to_find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); //2
        int b = input.nextInt();//3
        int c = input.nextInt();//4
        int max=a;
            if( b > max) {
                max = b;
            }
            if (c>max)
            {
                max=c;
            }
            System.out.println(max);
        }
    }
