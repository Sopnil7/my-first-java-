class A
{  
  A(){ 
       System.out.println(" Default Contructor");
      }  
  A(int x){  
this();  
System.out.println(x);  
}  
}
class question2{  
    public static void main(String args[]){  
     A a=new A(10);  
}
}