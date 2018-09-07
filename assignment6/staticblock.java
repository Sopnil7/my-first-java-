class statics {
    static int i;
  static int j;
     int k;
    static {
        i = 10;
		j=20;
		System.out.println(i);
        System.out.println("static block called ");
    }
  
}
 
class staticblock {
    public static void main(String args[]) {
 
     System.out.println(statics.j); 
    }
}