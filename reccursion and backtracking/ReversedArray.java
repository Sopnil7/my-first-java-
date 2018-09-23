import java.util.*;
public class ReversedArray 
{
	public static void reverse(int arr[] , int i , int j)
	{
		if(i>j)
			return;
		else if( i<= j)
		{
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
			reverse(arr,i,j);
		}
	}
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter size");
		int size , i;
		boolean b;
		
		size = ip.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array elements");
		for( i=0 ; i<size ; i++)
		{
			arr[i] = ip.nextInt();
		}
		int len = arr.length-1;
		i=0;
		reverse(arr , i , len);
		
		System.out.println("Reversed array is ");
		for( i=0 ; i<size ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}