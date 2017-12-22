package ik.datastructures;

public class LRUCache_FROMCLASS<K,V> {
	private : MAP<k,Dnode*<K,V>> m_map;
				DNode<k,V> *m_head, *m_tail;
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void set(K key, V val){
		boolean exists = m_map.contains(key);
		DNode<K,V>* valNode = exists? m_map.get(key):new DNode<K,V>(key,val);
		
		if(exists){
			valNode -> val = val;
			unlink_node(valNode);
		}
		add_to_beginning(valNode);
	}
	
	
	//Seperate the code to unlink to make it easy to read
	void unlink_node(Node){
		
	}
	
	void add_to_beginning(Node){
		
	}
	
	void get(Key k, Val v){	}
	void remove(Key k, Val v){	}
	
	//Evict should be called on its own, so it can be called as part of SET if it satisfies some condition.
	void EVICT(){
		
	}
}
