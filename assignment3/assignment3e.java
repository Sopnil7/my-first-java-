import java.util.Scanner;
public class assignment3e
{

	 public static void main(String[] args){  
	  int r,sum=0,temp;
	   int n;
	   System.out.println("enter your number");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
}