package ik.datastructures;

/*
 * Define the array, array size, type etc. 
 * USING Circular array.
*/
public class QueueByArray {

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = 0; // Can avoid this by using the front and rear to calculate.
			
	public static void main(String[] args) {
		int[] input = {0,1,2,3,4,5,6,7,8,9};
		QueueByArray qu = new QueueByArray(input);
	}
	
	/*
	 * Constructor will add the array list to the queue by default
	 * */
	public QueueByArray(int[] arr){
		if(arr.length > this.queue.length ){
			System.out.println("Insert values bigger than the size of the array");
			System.exit(0);;
		}
			
		for (int i = 0; i < arr.length; i++) {
			enQueue(arr[i]);
		}
	}
	
	public QueueByArray() {
	}

	/*
	When rear is pointing the max index, throw exception.
	 */
	void enQueue(int x){
		if(isFull()){
			System.out.println("Queue is full, cannot enqueue");
		}
		
		rear = (rear+1)%queue.length;
		if(isEmpty()) front = rear;
		
		queue[rear]=x;		
	}
	
	/*
	 * While deleting the last element, need to set the queue to isEmpty condition, where front and rear are pointing to -1.
	*/
	void deQueue(){
		if(isEmpty()){ 
			System.out.println("Cannot Dequeue, empty QUEUE");
		}else if(front==rear){//Only one element in queue
			front=rear=-1;
		}else{
			front = (front+1)%queue.length;
		}
	}
	
	int size(){
		if(isEmpty()) return 0;
		
		return (rear-front+queue.length)%queue.length+1;
	}
	
	int front(){
		return queue[front];
	}
	
	boolean isEmpty(){
		if(front==-1 && rear==-1) return true;
		
		return false;
	}
	
	boolean isFull(){
		if(((front+queue.length)-1)%queue.length==rear) return true;
			return false;
	}
}
