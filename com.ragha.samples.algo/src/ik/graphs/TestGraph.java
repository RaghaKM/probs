package ik.graphs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.jws.Oneway;

public class TestGraph {

	public static void main(String[] args) {
		
		GraphNode rootNode = createGraph();
		HashSet<GraphNode> visited = new HashSet<GraphNode>();
	
		System.out.println("B FS");
		bfs(rootNode,visited);
		System.out.println("========================");
		visited.clear(); // Clean visited before using in DFS
		System.out.println("D FS (Recurssion)");
		dfsRecur(rootNode,visited);
		System.out.println("========================");
		visited.clear();
		System.out.println("D FS");
		dfs(rootNode,visited);
		System.out.println("========================");
	}

	public static void bfs(GraphNode rootNode,HashSet<GraphNode> visited){
		if(rootNode==null || visited.contains(rootNode)) return;
		GraphNode currNode;
		Queue<GraphNode> queue = new LinkedList<TestGraph.GraphNode>();
		queue.offer(rootNode);
		
		while(!queue.isEmpty()){
			currNode = (GraphNode)queue.poll();
		if(visited.contains(currNode)){
			
		}else{
			System.out.println(currNode.val+" -- "+currNode.neighbor.size());
			visited.add(currNode);
			for(GraphNode node:currNode.neighbor) {
				queue.offer(node);
			}
		}
		
		}
	}	
	
	public static void dfsRecur(GraphNode rootNode,HashSet<GraphNode> visited){
		
		if(rootNode==null || visited.contains(rootNode)) return;
		
		System.out.println(rootNode.val+"--"+rootNode.neighbor.size());
		visited.add(rootNode);
		
		Vector<GraphNode> neighbors = rootNode.neighbor;
		for(GraphNode node:neighbors){
			dfsRecur(node,visited);
		}
	}
	
	public static void dfs(GraphNode rootNode,HashSet<GraphNode> visited){
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(rootNode);
		GraphNode currNode;
		
		while(!stack.isEmpty()){
		currNode = stack.pop();
		if(!visited.contains(currNode)){
		System.out.println(currNode.val+" -- "+currNode.neighbor.size());
		visited.add(currNode);
			for (GraphNode node:currNode.neighbor) {
				if(!visited.contains(node))	stack.push(node);
			}
		}
	  }
	}
	
	public static GraphNode createGraph(){
		
	/*	Node Structure
		   1
		  /	 \
		2	  3 
		  \  /
		   4
		   |
		   5
		*/   

		//GraphNode rootNode = new GraphNode(0);
		GraphNode nodeOne = new GraphNode(1);
		GraphNode nodeTwo = new GraphNode(2);
		GraphNode nodeThree = new GraphNode(3);
		GraphNode nodeFour = new GraphNode(4);
		GraphNode nodeFive = new GraphNode(5);
		
		nodeOne.neighbor.add(nodeTwo); nodeOne.neighbor.add(nodeThree); // 1's neighbors
		nodeTwo.neighbor.add(nodeOne);nodeTwo.neighbor.add(nodeFour); // 2's neighbors
		nodeThree.neighbor.add(nodeOne);nodeThree.neighbor.add(nodeFour); // 3's
		nodeFour.neighbor.add(nodeFive);nodeFour.neighbor.add(nodeThree);nodeFour.neighbor.add(nodeTwo); // 4's
		nodeFive.neighbor.add(nodeFour); // 5's
		
		//return rootNode;
		return nodeOne;// Assuming nodeOne is root node right now.
	}
	
	
	static class GraphNode implements Comparator<GraphNode>{
		int val ;
		Vector<GraphNode> neighbor = new Vector<TestGraph.GraphNode>();
		
		public GraphNode(int value, Vector<GraphNode> neighbors) {
			this.val = value;
			this.neighbor = neighbors;
		}
		
		public GraphNode(int value,GraphNode node){
			this.val = value;
			this.neighbor.add(node);
		}
		
		public GraphNode(int value){
			this.val = value;
		}

		@Override
		public int compare(GraphNode g1, GraphNode g2) {
			if(g1!=null && g2!=null){
				if(g1.val==g2.val) return 0;
				else if(g1.val > g2.val) return 10;
				else return -10;
			}
			return -9999;
		}
	}
}