package Assightment_solved;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//       int num=in.nextInt();//153

 for (int num=101;num<1000;num++) {
     int temp=num;
     int sum=0;
     while (num > 0)//153 //15 //1
     {
         int rem = 0;
         rem = num % 10;//3 //5 //1
         sum = sum + (rem * rem * rem);//27//125//1
         num = num / 10;//15/1
     }
     System.out.println(num);
//     if (temp == sum)
//         System.out.println("true");
//     else
//         System.out.println("false");
 }
    }
}
