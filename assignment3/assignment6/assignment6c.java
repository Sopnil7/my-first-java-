//class that cannot be extended
final class Final{
	private String s="this class cannot be extended.";
	void display(){
		System.out.println(s);
	}
}
public class FinalClass {
	public static void main(String[] args) {
	Final f=new Final();
	f.display();
	}
}