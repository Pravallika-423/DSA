package queue;

public class QueueUsingArray {

	int front;
	int rear;
	int[] arr;
	int size;
	
	QueueUsingArray(int size){
		this.size = size;
		front = -1;
		rear = -1;
		arr = new int[size];
	}
	
	public void enqueue(int ele) {
		if(rear == size -1) {
			System.out.println("Queue is full");
			return;
		}
		if(front == -1) {
			front = 0;
		}
		
		rear++;
		arr[rear] = ele;
		
	}
	
	public int dequeue() {
		if(rear == -1) {
			System.out.println("Queue is empty");
			return -1;
		}
		int value = arr[front];
		front++;
		return value;
	}
	
	public int peek() {
		if(front == -1 || front>rear) {
			System.out.println("Empty Queue");
			return -1;
		}
		return arr[front];
	}
	
	public void display() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return ;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
