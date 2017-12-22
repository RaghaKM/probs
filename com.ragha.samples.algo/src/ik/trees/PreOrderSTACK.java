package ik.trees;

public class PreOrderSTACK {
	
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
	
	 public static void main(String[] args)
	 {
	  PreOrderSTACK bi=new PreOrderSTACK();
	  // Creating a binary tree
	  TreeNode rootNode=createBinaryTree();
	  System.out.println("Using Recursive solution:");
	  
	  bi.preorder(rootNode);
	  
	  System.out.println();
	  System.out.println("-------------------------");
	  System.out.println("Using Iterative solution:");
	  
	  bi.preorderIter(rootNode);
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
	  node20.right=node30;
	  
	  node60.left=node50;
	  node60.right=node70;
	  
	  return rootNode;
	 }

}
