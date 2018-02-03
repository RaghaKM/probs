package ik.sorting.heap;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class BuildHeap {
	/*
		We are going to build the heap from start
		by providing heap size, in earlier heaps, I take the 
		existing array and sort the same. 
	*/
	public static void main(String[] args) {
		int[] arr = {2,3,6,3,7,1};
		Heap heap = new BuildHeap().new Heap();
		for (int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		heap.delete();
		
		System.out.println(heap.getHeap());
		heap.delete();
		System.out.println(heap.getHeap());
		heap.add(2);
		System.out.println(heap.getHeap());
	}
	
	public class Heap{
		ArrayList<Integer> list;
		
		public Heap(){
			list = new ArrayList<Integer>();
		}
		
		void heapify(int i){
			int min = i;
			int left = leftChild(i);
			int right = rightChild(i);
			
			if(left < list.size() && list.get(left) < list.get(min)) min = left;
			
			if(right < list.size() && list.get(right) < list.get(min)) min = right;
			
			if(min != i){
				swap(min,i);
				heapify(min);
			}
		}
		
		void reverseHeapify(int i){
			//TODO exit conditions for Heapify and reverseHeapify needed? 
			//ex : reverseHeapify can end when i is 0.
			
			int parent = parent(i);
			
			if(list.get(parent) > list.get(i)){
				swap(parent, i);
				reverseHeapify(parent);
			}
		}
		
		void add(int val){
			list.add(val);
			reverseHeapify(list.size()-1);
		}
		
		void delete(){
			swap(0, list.size()-1);
			list.remove(list.size()-1);
			heapify(0);
		}
		
		int getHeap(){
			return list.get(0);
		}
		
		void swap(int left, int right){
			int temp = list.get(left);
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

}