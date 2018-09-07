import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int i,num;
System.out.println("enter the value of num");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
