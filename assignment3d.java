import java.util.Scanner;
public class assignment3d
{
	public static void main(String[] args)
	{
		System.out.println("enter first number");
	Scanner a=new Scanner(System.in);
	int b;
	b=a.nextInt();
	System.out.println("enter second number");
	Scanner c=new Scanner(System.in);
	int d;
	d=c.nextInt();
	System.out.println("enter third number");
	Scanner e=new Scanner(System.in);
	int f;
	f=e.nextInt();
	if(b>=d && b>=f)
	{
		System.out.println("your greatest number is:"+b);
	}
	else if(d>=b && d>=f)
	{
		System.out.println("your greatest number is:"+d);
	}
	else
	   {
			System.out.println("your greatest number is:"+f);
		}
	
	
	}
}