package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Design a data structure that supports insert, delete, search and getRandom in constant time
 Design a data structure that supports following operations in Θ(1) time.

 insert(x): Inserts an item x to the data structure if not already present.

 remove(x): Removes an item x from the data structure if present.

 search(x): Searches an item x in the data structure.

 getRandom(): Returns a random element from current set of elements
 
 Soln:
 
 create a list of keys -> List<Keys>
 create a map of index and value  -> Map<index, value>
 */
public class MagicMap {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	List<String> list = new ArrayList<String>();

	public MagicMap(Map<Integer, Integer> map, List<String> list) {
		super();
		this.map = map;
		this.list = list;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void showDetails() {
		System.out.println(" List Details");
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(" Map Details");
		System.out.println(Arrays.asList(map));
	}

	public int get(String key) {
		if (list.contains(key)) {
			int index = list.indexOf(key);
			return map.get(index);
		}
		return 0;

	}

	public void set(String key, int value) {
		if (!list.contains(key))
			list.add(key);
		int index = list.indexOf(key);
		map.put(index, value);

	}

	public void delete(String key) {
		if (list.contains(key)) {
			int index = list.indexOf(key);
			map.remove(index);
			list.remove(index);
		}
	}

	public int getrandom() {
		int len = list.size();
		Random r = new Random();
		int j = r.nextInt(len);
		return map.get(j);
	}

	public static void main(String[] args) {
		MagicMap mm = new MagicMap(new HashMap<Integer, Integer>(),
				new ArrayList<String>());
		mm.set("A", 1);
		mm.set("b", 2);
		mm.set("c", 3);
		mm.set("d", 4);
		mm.set("e", 5);
		mm.set("a", 6);
		mm.showDetails();
		System.out.println(mm.get("d"));
		System.out.println(mm.getrandom());
		mm.set("c", 23);
		mm.delete("a");
		mm.showDetails();
	}
}