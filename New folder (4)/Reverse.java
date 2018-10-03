import java.util.Scanner;
public class Reverse{

	public int[] create(int []a){

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){

			a[i] = sc.nextInt();
		}
		return a;
	}
	public void print(int []a){

		for(int i = 0; i < a.length; i++){

			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public int[] reverse(int []a){

		for (int i = 0,j = a.length - 1; i < a.length / 2; i++) {
			
			int tmp = a[i];
			a[i] = a[j - i];
			a[j - i] = tmp;
		}
		return a;
	}
	public static void main(String args[]){

		Reverse o = new Reverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []a = new int[n];
		a = o.create(a);
		System.out.println("Original array");
		o.print(a);
		a = o.reverse(a);
		System.out.println("Reverse array");
		o.print(a);
	}
}