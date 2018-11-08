class Display implements Runnable 
{
	int start;
	int end;

	Display(int s , int e) 
	{
		start = s;
		end = e;
	}

	public void run()
	{
		print();
	}

	private synchronized void print()
	{
		for (int i=start ; i<=end ; i++)
			System.out.println((Thread.currentThread()).getName() + " : " + i);
	}

}

public class MultiThreading
{
	public static void main(String[] args) throws Exception 
	{
		Thread obj1 = new Thread(new Display(1,499));
		Thread obj2 = new Thread(new Display(500,1000));
		obj1.start();
		Thread.sleep(100);
		obj2.start();
	}
}