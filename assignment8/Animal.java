interface detail {

    void callSound();
    void eat();

}
 class Cat implements detail {
    public void callSound() {
System.out.println("in cat");
        System.out.println("meow");
    }
    public void eat(){
     System.out.println("milk"); 
     }

}
 class Dog implements detail {

    public void callSound() {
System.out.println("In dog");
        System.out.println("bow-bow");}
 public void eat(){
     System.out.println("flesh"); 
     }
    }

public class Animal {

    public static void main(String[] args) {
        detail[] animals = new detail[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].callSound();
            animals[i].eat();
        }
    }

}