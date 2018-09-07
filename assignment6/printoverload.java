class print
{
void printing()
{
System.out.println("HELLO this is Null arguments Function");
}
void printing(int i,int j)
{
System.out.println("HELLO this is integer function  "+i+" "+j);
}
void printing(float i,float j)
{
System.out.println("HELLO this is Float function "+i+" "+j);
}
void printing(int i,float j)
{
System.out.println("HELLO this is one integer one float function "+i+" "+j);
}
}

class printoverload
{
public static void main(String args[])
{
print p=new print();
p.printing();
p.printing(5,10);
p.printing(0.005f,1.2587f);
p.printing(4121f,3654f);
}
}