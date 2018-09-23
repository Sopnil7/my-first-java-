import java.util.*;

public class RemoveDuplicate
{
	private static Scanner ip = new Scanner(System.in);
	public static String removeduplicate(String s) 
	{
		if (s.length() == 1)
			return s;
		String str = "";
		for (char i : s.toCharArray()){
			String s1 = removeduplicate(Character.toString(i));
			if (!str.contains(s1))
				str += s1;
		}
		return str;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter string : ");
		String s = ip.nextLine();
		System.out.println("String after duplicates are removed : " + removeduplicate(s));
	}
	
}