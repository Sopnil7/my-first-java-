import java.util.Scanner;
public class RecursiveCheck {

	public static boolean check(int arr[] , int m , int i)
	{
		if(i < arr.length )
		{
			if (m == arr[i])
				return true;
			return	check(arr,m,i+1);
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size");
		int size , j=0;
		boolean b;
		
		size = ip.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array elements");
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = ip.nextInt();
		}
		System.out.println("Enter value");
		int m;
		m = ip.nextInt();
		b = check(arr , m , j);
		System.out.println(b);
	}

}