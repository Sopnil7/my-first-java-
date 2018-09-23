import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Customer
{
	private int cust_id;
	Customer(int id)
	{
		cust_id = id;
	}
	public int getId()
	{
		return cust_id;
	}
	public void setId(int id)
	{
		cust_id = id;
	}
	
	public int hashCode()
	{
		return (cust_id + 5);
	}
	
	public boolean equals(Object o)
	{
		Customer c = (Customer)o;
		if(cust_id == c.getId()){
			return true;
		}
		return false;
	}
}


public class compareSet 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Set<Customer> c1 = new HashSet<>();
		Set<Customer> c2 = new HashSet<>();
		
		System.out.println("Enter values for first set");
		for(int i=1 ; i<=5 ; i++)
		{
			int val = ip.nextInt();
			c1.add(new Customer(val));
		}
		System.out.println("Enter values for second set");
		for(int i=1 ; i<=5 ; i++)
		{
			int val = ip.nextInt();
			c2.add(new Customer(val));
		}
		
		c1.retainAll(c2);
		System.out.println("Elements that are common in both sets :");
		for(Customer c : c1)
		{
			System.out.print(c.getId() + " ");
		}
	}

}