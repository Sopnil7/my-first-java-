import java.util.*;
public class Fabonacci 
{
	public static void fibonacci(int a , int b , int n)
	{
		if(n == b)
			return;
		else
		{
			System.out.print( a + b + " ");
			fibonacci(b,a+b,n);
		}
					
	}
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter nth number");
		int n;
		n = ip.nextInt();
		int a=0 , b=1 ;
		
		System.out.println("Fabonacci numbers upto " + n  + " is : ");
		System.out.print(a + " " + b + " ");
		fibonacci(a,b,n);
	}

}