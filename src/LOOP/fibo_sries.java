package LOOP;

import java.util.Scanner;

public class fibo_sries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int temp=0;
       int n= in.nextInt();
       for(int i=0; i  < n ;i++)
       {
           temp=a+b;
           a=b;
           b=temp;
        }
        System.out.println(temp);
    }
}
