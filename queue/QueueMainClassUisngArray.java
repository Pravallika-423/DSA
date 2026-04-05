package queue;

import java.util.Scanner;

public class QueueMainClassUisngArray {

	public static void main(String[] args) {
		
		QueueUsingArray q = new QueueUsingArray(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		//q.enqueue(6);
		
		q.display();
		
		System.out.println(q.dequeue());
		
		q.display();
		
		System.out.println(q.peek());
		
		q.display();
	}
}
