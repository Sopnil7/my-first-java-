import java.lang.Math;
import java.util.Scanner;
class Armstrong {
  public static void main(String[] args) {
    int i,j,a,b,c=0,n;
    double sum=0;
    Scanner o=new Scanner(System.in);
    System.out.println("enter a number to check armstrong");
    n=o.nextInt();
    a=n;
    b=n;
    while(a!=0){
      c++;
      a=a/10;
    }
    while(b!=0)
    {
      i=b%10;
      b=b/10;
      sum=sum+Math.pow(i,c);
    }
    if(sum==n)
    System.out.println("number is armstrong");
    else
    System.out.println("number is not armstrong");
  }
} 
