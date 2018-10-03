import java.util.*;
public class Intersection{

	public int[] create(int []a){
		System.out.println("Enter the element to insert");
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
	public ArrayList<Integer> intersectArr(int []a,int []b){
		int i = 0, j = 0;
		//print(a);
		//print(b);
		int [] tmp = new int[a.length];
		ArrayList<Integer> l = new ArrayList<>();
		while(i < a.length && j < b.length)
		{
			if(a[i] == b[j]){
				l.add(a[i]);
				i++;
				j++;
			}
			else
			{
				if(a[i] > b[j]) j++;
				else i++;
			}
		}
		return l;
	}
	public static void main(String args[]){

		Intersection o = new Intersection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n = sc.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		a = o.create(a);
		b = o.create(b);
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> l = o.intersectArr(a,b);
		System.out.println(l);

	}
}