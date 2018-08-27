class Myclass{
	private int x;
	private int y;
	Myclass(){
		x=1;
	}
	Myclass(int i){
		this();
		y=i;
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class assignment6a {
	public static void main(String[] args) {
	Myclass t=new Myclass(5);
	
}
}
