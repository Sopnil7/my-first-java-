public class GenericPrint
{
	public <T> void print(T arr[])
	{
		for (T i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) 
	{
		GenericPrint obj = new GenericPrint();
		Integer arr[] = new Integer[10];
		Character carr[] = new Character[10];

		for (int i=0; i<10; i++)
			arr[i] = i*2;

		for (int i=0; i<10; i++)
			carr[i] = (char)(65+i);

		System.out.println("Integer array elements are :");
		obj.print(arr);
		System.out.println("Character array elemets are :");
		obj.print(carr);

	}


}