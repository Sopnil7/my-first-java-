import java.util.Scanner;
public class Maximum{

	public int[] create(int []a){

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){

			a[i] = sc.nextInt();
		}
		return a;
	}
	public void print(int []a){

		for(int i = 0;i < a.length; i++){

			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public int maxFind(int []a){

		int max = -999999;
		for(int i = 0; i < a.length; i++){

			if(a[i] > max) max = a[i];
		}
		return max;
	}
	public static void main(String args[]){

		Maximum o = new Maximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []a = new int[n];
		a = o.create(a);
		System.out.println("array is");
		o.print(a);
		int r = o.maxFind(a);
		System.out.println("the maximum in the array is "+r);
	}
}