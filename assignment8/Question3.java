import java.util.*;    
public class Question3{
          public static void main(String[] x){
                  Scanner sc = new Scanner(System.in);
             String name = sc.nextLine();
             String name1 = sc.nextLine();
                  
                  int n1 = Integer.parseInt(name);
                  int n2 = Integer.parseInt(name1);
           if(n1>n2)
           System.out.println(n1+" Is bigger than "+n2);
           else
           System.out.println(n2+" Is bigger than "+n1);
              }
            }