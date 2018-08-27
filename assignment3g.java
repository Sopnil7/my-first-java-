import java.util.Scanner;
public class assignment3g
{  
public static void main(String[] args) {

	        int num, reversed = 0;
	        System.out.println("enter number");
	    	Scanner a=new Scanner(System.in);
	    	num=a.nextInt();

	        for(;num != 0; num /= 10) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	        }

	        System.out.println("Reversed Number: " + reversed);
	    }
}