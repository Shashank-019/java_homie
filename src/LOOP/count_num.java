package LOOP;

public class count_num {
    public static void main(String[] args) {
        int no=565656665;
        int count = 0;
        while(no > 0)
        {
            int rem=no%10;
            if(rem==6) {count++;}
            no=no/10;

        }
        System.out.println(count);
    }
}
