package ik.sorting.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeKSortedArrays {

	static int[] mergeArrays(int[][] arr) {
		int[] pos = new int[arr.length];
		int[] result = new int[arr.length * arr[0].length];
		boolean flag = true;
		Heap minHeap = new Heap();
		Node rootNode, newRoot;
		int rowIndex,colIndex;
		
		for(int j=0;j<pos.length; j++){
			pos[j] = 0;
			minHeap.add(new Node(arr[j][0],j));
		}
		
		for(int i=0;i<result.length;i++){
			
			result[i] = minHeap.getHeap().val;
			rootNode = minHeap.getHeap();
			rowIndex = rootNode.rowNum;
			colIndex = pos[rowIndex]+1;
			pos[rowIndex] = colIndex;
			
			if(colIndex < arr[rowIndex].length)
				newRoot = new Node(arr[rootNode.rowNum][colIndex], rowIndex);
			else //if(colIndex==arr[rowIndex].length) 
				newRoot = new Node(Integer.MAX_VALUE,rowIndex);
			
			minHeap.replaceRoot(newRoot);
			
		}
		
		return result ;
    }

public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        int[] res;
       /* int arr_rows = 0;
        int arr_cols = 0;
        arr_rows = Integer.parseInt(in.nextLine().trim());
        arr_cols = Integer.parseInt(in.nextLine().trim());
        int[][] arr = new int[arr_rows][arr_cols];*/
        int[][] arr = {{1, 3, 5, 7},{2, 4, 6, 8},{0, 9, 11, 12}};
       // int[][] arr = { { 26, -15, -20 }, { 27, 19, -18 } };
        
       /* for(int arr_i = 0; arr_i < arr_rows; arr_i++) {
            for(int arr_j = 0; arr_j < arr_cols; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        if(in.hasNextLine()) {
          in.nextLine();
        }*/
        res = mergeArrays(arr);
        System.out.println(Arrays.toString(res));
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        bw.close();
    }

public static class Heap{
	ArrayList<Node> list;
	
	public Heap(){
		list = new ArrayList<Node>();
	}
	public Heap(Node[] nodeArr){
		for(int i = 0; i<nodeArr.length; i++)
			this.add(nodeArr[i]);
	}
	
	void heapify(int i){
		int min = i;
		int left = leftChild(i);
		int right = rightChild(i);
		
		if(left < list.size() && list.get(left).val < list.get(min).val) min = left;
		
		if(right < list.size() && list.get(right).val < list.get(min).val) min = right;
		
		if(min != i){
			swap(min,i);
			heapify(min);
		}
	}
	
	void replaceRoot(Node newRoot){
		list.set(0,newRoot);
		heapify(0);
	}
	
	void reverseHeapify(int i){
		//TODO exit conditions for Heapify and reverseHeapify needed? 
		//ex : reverseHeapify can end when i is 0.
		
		int parent = parent(i);
		
		if(list.get(parent).val > list.get(i).val){
			swap(parent, i);
			reverseHeapify(parent);
		}
	}
	
	void add(Node node){
		list.add(node);
		reverseHeapify(list.size()-1);
	}
	
	void delete(){
		swap(0, list.size()-1);
		list.remove(list.size()-1);
		heapify(0);
	}
	
	Node getHeap(){
		return list.get(0);
	}
	
	void swap(int left, int right){
		Node temp = list.get(left);
		list.set(left, list.get(right));
		list.set(right, temp);
	}
	
	int leftChild(int i){
		//TODO check for boundary condn if I is within the array
		return 2*i+1; //TODO Also check and make sure value returning is valid index in array to avoid OOB ex.
	}
	int rightChild(int i){
		//TODO check for boundary condn if I is within the array
		return 2*i+2; //TODO Also check and make sure value returning is valid index in array to avoid OOB ex.
	}
	int parent(int i){
		//TODO check if i is valid
		return (i-1)/2;
	}
}

public static class Node{
	int val;
	int rowNum;
	
	public Node(int value, int row){
		val = value;
		rowNum = row;
	}
}

}