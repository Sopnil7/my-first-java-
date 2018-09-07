abstract class Animal {
     String color,breed,name;
    abstract void eat();
    public void speak(){}
}
    class cat extends Animal{
         void getdata(){
             color = "black";
             breed = "xyz";
             name  = "cat";
            
               }
      public void speak(){
     System.out.println("cat speak:-meow cat colo:- "+color+"breed:- "+breed+" name:- "+name);
             }
      
        void eat(){
       System.out.println("cat food");
          }
    }
    class dog extends Animal{
         void getdata(){
             color = "white";
             breed = "xyz";
             name  = "dog";
               }
      public void speak(){
    System.out.println("dog speak:-meow dog colo:- "+color+"breed:- "+breed+" name:- "+name);
             }
        void eat(){
       System.out.println("dog food");
          }
    }
  public class Question2{
      public static void main(String args[]){
          Animal c = new cat();
          c.speak();
          c.eat();
          Animal d = new dog();
          d.speak();
          d.eat();
     }
   }