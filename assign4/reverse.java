import java.util.Scanner;
class reverse {

    public static void main(String[] args) {

        int num, reversed = 0;
Scanner s=new Scanner(System.in);
       System.out.println("enter no");
num=s.nextInt();
while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
