

interface Animals
{
}
class cat implements Animals
{
	void speak()
	{
		System.out.println("nyaa");
	}
	void eat()
	{
		System.out.println("milk");
	}
}
class dog implements Animals
{
void speak()
{
	System.out.println("bark");
}
void eat()
{
	System.out.println("meat");
}
}
public class assignment7a
{
	public static void main(String[] args)
	{
		cat a=new cat();
		a.speak();
		a.eat();
		dog b=new dog();
		b.speak();
		b.eat();
	}
		
}


