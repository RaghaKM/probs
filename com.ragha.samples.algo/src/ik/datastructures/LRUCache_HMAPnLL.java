package ik.datastructures;

import java.util.HashMap;
import java.util.Map;

public class LRUCache_HMAPnLL{
	
	Map<Integer,DNode> cache = new HashMap<Integer,DNode>();
	DNode top; 
	DNode end;
	int size;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache_HMAPnLL LRUCache = new LRUCache_HMAPnLL(10);
		LRUCache.add(5,"FIVE");
		
	}
	
	void add(int key, String val){
		boolean keyExist = cache.containsKey(new Integer(key));
		
		if(!keyExist && cache.size()>=size){
			evict();//Remove before adding new
		}
		
		DNode node = keyExist ? cache.get(new Integer(key)) : new DNode(null, null, key, val);
		cache.put(new Integer(key), node);
		
		if(keyExist){
			node.cacheVal = val;
			//node.setVal(val);
			//if(node!=top)
				seperateFromList(node);
		}
		pushOnTop(node);
	}
	
	//void evict(DNode node){
	void evict(){ // evicting oldest node
		end.prev.next=null; //Set last but one to Null
		cache.remove(end.mapKey);//Removing the reference from Map
		end = end.prev;
	}
	
	void seperateFromList(DNode currNode){
		
		if(top==null) return;
				
		if(currNode == top) 
			top = top.next;
			
		if(currNode == end)
			end = end.prev;
		
		DNode prevNode = currNode.prev;
		DNode nextNode = currNode.next;
		
		if(prevNode!=null)
			prevNode.next = currNode.next;
		
		if(nextNode!=null)
			nextNode.prev = currNode.prev;
	}
	
	void pushOnTop(DNode node){
		
		if(top == node) return;

		if(top!=null){
			// NOT REQUIRED node.prev = null;
			node.next = top;
			top.prev = node;
		}
		else
		{
			end = node;
		}
		top = node;

	}
	
	boolean keyExists(int key){
		return cache.containsKey(new Integer(key))? true : false;
	}
	
	boolean UpdateDNode(int key, String Val){
		return false;//TODO 
	}
	
	private LRUCache_HMAPnLL(int size){
		this.size = size;
	}

	private class DNode{
		DNode prev;
		DNode next;
		String cacheVal;
		Integer mapKey;
		
		private DNode(DNode prev, DNode next,  Integer key, String cacheVal){
			this.prev = prev;
			this.next = next;
			mapKey = key;
			this.cacheVal = cacheVal;
		}
		
		void setVal(String val){
			cacheVal = val;
		}
	}

}