import java.util.*;
public class GenericSorting
{
	private static Scanner ip = new Scanner(System.in);
	public static <T extends Comparable<T>> void sort(T arr[])
	{
		T temp;
		for (int i=0; i < arr.length; i++) 
		{
			for (int j=i+1 ; j < arr.length ; j++) 
			{
				if (arr[i].compareTo(arr[j]) > 0)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String []args) 
	{
		System.out.println("Case 1 for Integer Type");
		System.out.println("Case 2 for Character Type");
		System.out.println("Case 3 for Float Type");
		
		System.out.println("Enter your choice");
		int ch = ip.nextInt();
				
		switch(ch)
		{
			case 1 :  
			{
				System.out.println("Enter size of an integer array :");
				int s = ip.nextInt();
				Integer arr[] = new Integer[s];
				System.out.println("Enter elements");
				for(int i=0 ; i<s ; i++ )
				{
					int d = ip.nextInt();
					arr[i] = d;
				}
				sort(arr);
				System.out.println(Arrays.toString(arr));
				break;
			}
			case 2 :  
			{
				System.out.println("Enter size of an character array :");
				int s = ip.nextInt();
				Character carr[] = new Character[s];
				System.out.println("Enter elements");
				for(int i=0 ; i<s ; i++ )
				{
					char c = ip.next().charAt(0);
					carr[i] = c;
				}
				sort(carr);
				System.out.println(Arrays.toString(carr));
				break;
			}
			case 3 :  
			{
				System.out.println("Enter size of an float array :");
				int s = ip.nextInt();
				Float farr[] = new Float[s];
				System.out.println("Enter elements");
				for(int i=0 ; i<s ; i++ )
				{
					float f = ip.nextFloat();
					farr[i] = f;
				}
				sort(farr);
				System.out.println(Arrays.toString(farr));
				break;
			}
			default :
			{
				System.out.println("No such case");
				break;
			}
		}
		ip.close();
	}
}