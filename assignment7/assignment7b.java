abstract class Animal{
	private String color;
	private String breed;
	private String name;
	Animal(String c,String b,String n){
		color=c;
		breed=b;
		name=n;
	}
	void speak(){
		System.out.println("my name is "+name+" and i am a "+color+breed+".");
	}
	abstract void eat();
}

class Puppy extends Animal{
	Puppy(String c,String b,String n){
		super(c,b,n);
	}
	void eat(){
		System.out.println("i love meat!");
	}
}
public class assignment7b {
	public static void main(String[] args) {
		Puppy d=new Puppy("dog", "bull dog", "TOMMY");
		d.speak();
		d.eat();
}
}