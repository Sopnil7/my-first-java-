import java.util.*;
public class CalSquare 
{
	public static int calpow(int x , int y )
	{
		if(y == 1)
			return x;
		else
		{
			return x * calpow(x,y-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter x and y numbers");
		int x , y;
		x = ip.nextInt();
		y = ip.nextInt();
		System.out.println("Power of " + y + " to " + x + " is : " + calpow(x,y));
	}

}