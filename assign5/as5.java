import java.util.Scanner;
class as5
{
public static void main(String[] args)
{
int temp;
Scanner s=new Scanner(System.in);
int[] arr=new int[20];
for(int i=0;i<10;i++)
{
arr[i]=s.nextInt();
}
for(int i=0;i<10;i+=2)
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
for(int i=0;i<10;i++)
{
System.out.print(arr[i]+",");
}
}
}
