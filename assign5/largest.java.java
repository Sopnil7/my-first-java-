 import java.util.Scanner;
class largest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int[] arr=new int[10];
for(int i=0;i<10;i++)
{
arr[i]=s.nextInt();
}
int m,n;
m=n=-1;
for(int i=0;i<10;i++)
{
if(arr[i]>m)
{
n=m;
m=arr[i];
}
else if(arr[i]>n&&arr[i]<m)
{
n=arr[i];
}
}
System.out.println("Second largest number is : " + n);
}
}