import java.util.Scanner;
class rect
{
int lenght,breadth;
rect(int l,int b)
{
lenght=l;
breadth=b;
}
int area()
{
return(lenght*breadth);
}
};
class main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
rect r=new rect(l,b);
System.out.println("area of rectangle is"+" "+r.area());
}
};

