
     import java.util.Scanner;
public class assignment7c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println("greater of "+a+" and "+b +" = "+(a>b?a:b));
		sc.close();
	}
}