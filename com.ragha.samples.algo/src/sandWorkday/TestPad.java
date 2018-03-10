package sandWorkday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

import org.w3c.dom.Node;

public class TestPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*System.out.println("-- "+255444123/1000);
	System.out.println("-- "+255444123%1000);
	  String[] thousands = {"", "Thousand", "Million", "Billion"};
	
	  TreeSet<String> tSet = new TreeSet<String>();
	  //tSet.
	  TreeMap<String, Node>  treeMap;
	  
	int i = 1;
	int num=100;
	String word;
	
	int[] queue = new int[10];
	int front,rear;
	front=1;
	front=rear=-2;
	
	System.out.println(front);
	System.out.println(rear);
	System.out.println(((front+queue.length)-1)%queue.length==rear);*/
	
		//String ragha = "ragha";
	//System.out.println(ragha.length()+"--1 to 3 --"+ragha.substring(1, 5)+" -2- "+ragha.charAt(4));
	String str = "aqW9ertyzBs11ertyzBBsss";
	//System.out.println("2nd ::: "+str.substring(14, 23)+"----"+str.length());
	
	/*int[][] arr = {{1,2},{3,4}};
	System.out.println(" First : "+arr[0][0]+" Second : "+arr[0][1]);*/
	
  int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
	  System.out.println(arr.length);
	  System.out.println(arr[0].length);
	  System.out.println("One "+Arrays.toString(arr));
	
	  
	  System.out.println("======================");
	  
	  for (int i = 0; i < arr[0].length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j][i]+"\t");
		}
		System.out.println();
	}
	  
	  System.out.println("======================");
	  
	//printArrayList();

	//printAscii();    
	
	}//end of main
	
	
	public static void printArrayList(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3, 4);
		list.add(0, 0);
		System.out.println("--"+Arrays.toString(list.toArray()));
		System.out.println(list.get(3));
	}
	
	public static void printAscii(){
		//PRINTING all ASCII characters
	
		int i=0;
			    for(int letter= ' ';letter<274;letter++){
			    	System.out.println(i+"--"+letter+"--"+(char)letter);
			    	i++;
			    }
			
			    for (int c=32; c<128; c++) {
			        System.out.println(c + ": " + (char)c);
			       } 
	}
	
}