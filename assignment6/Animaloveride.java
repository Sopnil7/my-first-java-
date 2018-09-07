class Animal {
   String breed;
   String color;

   void Speak(){
       System.out.println("Animal speaks");
   }
   }
     
	 class Dog extends Animal{
                 String breed;
                 String color;

                 void Speak(){
                     System.out.println("Dog Speaks");
                 }
              }

                 class Cat extends Animal{
                 String breed;
                 String color;

                 void Speak(){
                     System.out.println("Cat speaks");
                 }
              }
      
	  class Animaloveride
	  {
   public static void main(String args[])
   {
       Animal obj1=new Animal();
       Animal obj2=new Dog();
       Animal obj3=new Cat();

       obj1.Speak();
       obj2.Speak();
       obj3.Speak();
   }

}