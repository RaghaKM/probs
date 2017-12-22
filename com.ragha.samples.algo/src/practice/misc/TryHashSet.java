package practice.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TryHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		HashMap hm = new HashMap();
		String st = "";
		
		hs.add("a");
		//System.out.println("Index of "+hs.);
		hs.add("z");
		hs.add("ragha");
		hs.add("java");
		hs.add("abc");
		hs.add(null);
		
		hm.put("a","a");
		hm.put("z","z");
		hm.put("ragha","ragha");
		hm.put("java","java");
		hm.put("abc","abc");
		
		for (Object entry:hs) {
			System.out.println( (String)entry);
			
		}
		

		Iterator it = hs.iterator();
		
		/*while (it.hasNext()) {
			System.out.print(" - "+it.next());
			
		}
		
		System.out.println(hs.toString());*/
	}

}
