import java.util.Scanner;
public class spiral
{
	Scanner sc = new Scanner(System.in);
	public int[][] create(int [][]a,int r,int c)
	{
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	public void printSpiral(int [][]a,int r,int c)
	{
		int i = 0, j = 0;
		for(j = 0; j < c; j++)
		{
			System.out.print(a[0][j]+" ");
		}
		j = c - 1;
		for(i = i + 1; i < r; i++)
		{
			System.out.print(a[i][j]+" ");	
		}
		i = r - 1;
		for(j = j - 1; j >= 0; j--)
		{
			System.out.print(a[i][j]+" ");
		}
		j = 0;
		for(i = i - 1; i >= 1; i--)
		{
			System.out.print(a[i][j]+" ");
		}
	}
	void printOri(int [][]a,int r,int c)
	{
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		spiral o = new spiral();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns");
		int c = sc.nextInt();
		int [][]a = new int[r][c];
		a = o.create(a,r,c);
		System.out.println("the matrix is ");
		o.printOri(a,r,c);
		System.out.println("the spiral print is");
		o.printSpiral(a,r,c);
	}
}