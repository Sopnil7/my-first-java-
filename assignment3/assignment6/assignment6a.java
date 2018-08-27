//invoking parent class method
 class Parent{
	 private int x;
	 private int y;
	 int sum(int a,int b){
		 x=a;
		 y=b;
		 return x+y;
	 }
}
 class Child extends Parent{
	 void getSum(int x,int y){
		 System.out.println(super.sum(x,y));
	 }
 }
public class assignment6b{
	public static void main(String[] args) {
	Child t=new Child();
	t.getSum(2,5);
	
}
}
