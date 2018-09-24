import java.util.*;
class ArrList
{
	private int arr[];
	private int size , index;
	ArrList(int s)
	{
		arr = new int[s];
		size = s;		
		index = -1;
	}
	
	public void add(int d)
	{
		if(index == size-1)
		{
			size = (size * 3) / 2;
			int t[] = arr;
			arr = new int[size];
			System.out.println("Size of new array is " + size);
			for(int i=0 ; i<=index ; i++ )
			{
				arr[i] = t[i];
			}
			index++;
			arr[index] = d;
		}
		else
		{
			index++;
			arr[index] = d;
		}
	}
	
	public void traverse()
	{
		if(index == -1 )
		{
			System.out.print("Array is empty!!!");
		}
		else
		{
			for(int i=0 ; i<=index ; i++ )
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
public class ArrayList
{
	public static void main(String[] x)
	{
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter size : ");
		int size;
		size = ip.nextInt();
		ArrList a = new ArrList(size);
		a.traverse();
		
		System.out.println("Elements are :");
		for(int i=1 ; i<=size ; i++)
		{
			a.add(i*2);
		}
		a.traverse();
		
		System.out.println("After extra element insertion.");
		a.add(22);
		a.add(44);
		System.out.println("Elements are :");
		a.traverse();
	}
}