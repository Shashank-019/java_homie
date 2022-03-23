package Assightment_solved;

import java.util.Scanner;

public class solve_1
{
    public static void main(String... args){
//        String a;
//        String b;
          String c;
          int a;
          int b;
        boolean d;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("enter first number =");
            a= in.nextInt();
           // x= Integer.parseInt(a);
            System.out.println("enter second number +");
            b=in.nextInt();
            System.out.println("Enter operation You want ( + , - , x , / ");
            c= String.valueOf(in.next().trim().charAt(0));
           // y= Integer.parseInt(b);

            switch (c) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> System.out.println(a / b);
                default -> System.out.println("operator is invalid");
            }
            System.out.println("Did you wanted to continue?/n if yes type :true /n if not type:false");
            d=in.nextBoolean();
        } while(d);

    }
}

