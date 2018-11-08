import java.util.*;
class sortt implements Comparable<sortt> 
{
  String name;
  int age;
  sortt() {}
  sortt(String name, int age) 
  {
    this.name = name;
    this.age = age;
  }
  
  void print() 
  {
    System.out.println( this.name + " " + this.age );
  }

  public int compareTo(sortt temp) 
  {
    if (this.name.equals(temp.name))
        return 0;
    else if (this.name.compareTo(temp.name) > 0)
        return 1;
    else
        return -1;
  }
}

public class SortingList
{
  public static void main(String[] args) 
  {
    List<sortt> ll = new ArrayList<>();
    ll.add(new sortt( "Pema" , 21 ) );
    ll.add(new sortt( "Tashi" , 22 ) );
    ll.add(new sortt( "Kinga" , 12 ) );
    ll.add(new sortt( "Lhaden" , 42 ) );
    ll.add(new sortt( "Dorji" , 38 ) );
    
    System.out.println("Sorts on the basis of name : ");
    Collections.sort(ll); 
    for (sortt i: ll)
      i.print();
    System.out.println();
  }
}