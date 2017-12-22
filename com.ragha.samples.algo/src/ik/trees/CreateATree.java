package ik.trees;

public class CreateATree {

	public static void main(String[] args) {
		  PreOrder bi=new PreOrder();
		  // Creating a binary tree
		  TreeNode rootNode=createBinaryTree();
		  System.out.println("Using Recursive solution:");
	  
		  System.out.println();
		  System.out.println("-------------------------");
		  System.out.println("Using Iterative solution:");
		  
	}
	
	TreeNode CreateATree(){
		
		return createBinaryTree();		
		
	}
	
	 public static class TreeNode
	 {
	  int data;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int data)
	  {
	   this.data=data;
	  }
	 }
	
	 
	 public static TreeNode createBinaryTree()
	 {
	  
	  TreeNode rootNode =new TreeNode(25);
	  TreeNode node20=new TreeNode(20);
	  TreeNode node10=new TreeNode(10);
	  TreeNode node30=new TreeNode(30);
	  TreeNode node15=new TreeNode(15);
	  TreeNode node25=new TreeNode(25);
	  TreeNode node35=new TreeNode(35);
	  TreeNode node40=new TreeNode(40);
	  
	  rootNode.left=node15;
	  rootNode.right=node35;
	  
	  node15.left=node10;
	  node15.right=node20;
	  
	  node35.left=node30;
	  node35.right=node40;
	  
	  return rootNode;
	 }
	
}
