package ik.graphs;

import java.util.HashMap;

public class FirstGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int vertex; 
	int edge;
	Hashmap adjVertices = new HashMap<K, V>();
	
	//In this the vertex could visit more than once
	void bfs(int vertex){
		visited = set();
		q = new Queue();
		q.enqueue(vertex);
		
		while(queue.notEmpty()){
			if(visited.contains(v))
				continue ; //do nothing. 
			else{
				print v.val;
				visited.add(v);
				for(i=0-->n)
					enqueue all the neighbors. 
			}
			
		}		
	}

	//calling method
	 dFS(v){
		 visited = set();
		 for v in list_of_v;
		depthFS(v,visited)
	 }
	 
	//visited[] is global at graph level in dfs method
	void depthFS(int vertex,int[] visited){
		if v is visited;
		return;
		
		print v.val;
		visited.add(v);
		for(n in v.neighbours)
			depthFS(n,visited);
	}
	

	
	
	
	
}
