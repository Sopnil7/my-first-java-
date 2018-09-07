import java.util.*;
class reverse
{
public static void main(String[] args)
{
System.out.println("enter a string to be reversed");
Scanner s= new Scanner(System.in);
String str=s.next();
String reverse=" ";
for(int i = str.length()-1;i >=0; i--)
{
reverse=reverse+str.charAt(i);
}
System.out.println("Reversed string is:"+reverse);
}
}