import java.util.*;
class Word_count{
         public static void main(String[] x){
         Scanner sc = new Scanner(System.in);
                 String s = sc.nextLine();
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	         } 
           }