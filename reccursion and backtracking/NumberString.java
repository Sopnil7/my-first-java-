import java.util.*;
public class NumberString 
{
	public static int calString(int num , int s )
	{
		if( num/10 == 0 )
		{
			s += (num % 10);
			return s;
		}
		else
		{
			int r = num % 10;
			s += r;
			num = num/10;
			return calString(num , s );
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String str;
		int i=0 , s=0 ;
		System.out.println("Enter string");
		str = ip.nextLine();
		
		int num = Integer.parseInt(str);
		s = calString(num,s);
		System.out.println("The sum of number is " + s);
	}

}