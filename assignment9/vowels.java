import java.util.*;
	class vowels
	{
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
            System.out.println("enter a string");
           	String  str=s.next();
            String nstr=str.replaceAll("[AEIOUaeiou]","");
            System.out.println("string without vowels is:"+nstr);
  

		}

	}