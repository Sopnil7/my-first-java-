import java.util.Scanner;
class complex
{
int img;
int rel;
complex(int i,int r)
{
img=i;
rel=r;
}
int c1()
{
return(rel);
}
int c2()
{
return(img);
}
};
class main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int i=s.nextInt();
complex c=new complex(i,r);
System.out.println(c.c1()+" "+"+"+" "+c.c2()+"i");
}
};