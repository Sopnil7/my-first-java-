import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<>();

		hm.put(1,"Dog");
		hm.put(2,"Cat");
		hm.put(3,"Cow");
		hm.put(4,"Lion");
		hm.put(5, "Wolf");

		for (int i: hm.keySet())
			System.out.println("Key " + i + " has value " + hm.get(i));

	}


}