import java.util.*;
class Occurrence {
    static int isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= M-N; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
     
            if (j == M)
                return i;
        }
     
        return -1;
    }
     
    /* Driver program to test above function */
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
         
        int res = isSubstring(s1, s2);
         
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " 
                                           + res);
    }
}