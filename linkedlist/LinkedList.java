package linkedlist;

//Insert beginning	O(1)
//Insert end	O(n)
//Delete	O(n)
//Traverse	O(n)
public class LinkedList {

	Node head;
	
	//insertEnd
	void insert(int ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
			System.out.println("New LL had been created with node value:"+ele);
			
		}
		else {
			Node temp=head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next=n;
			System.out.println("new node inserted with value"+ele);
		}
	}
	
	void insertFront(int ele)
	{
		Node n=new Node(ele);
		n.next=head;
		head=n;
		System.out.println("new node has been inserted in front with value :"+ele);
	}
	
	void display()
	{
		System.out.println("==========LinkedList===========");
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
				
			}
			System.out.println(temp.data);
		}
	}
	void deleteFront()
	{
		
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		else {
			System.out.println("node with the value"+head.data+"had been deleted" );
			head=head.next;
		}
		
	}
	void deleteLast()
	{
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		else if(head.next==null){
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null)
			{

				temp=temp.next;
			}
			System.out.println(temp.next.data+ " has been deleted");
			temp.next=null;
		}
	}
	
	void deleteBasedOnVAlue()
	{
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		else if(head.next==null){
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null)
			{

				temp=temp.next;
			}
			System.out.println(temp.next.data+ " has been deleted");
			temp.next=null;
		}
	}
	
	void reverse() {

	    Node prev = null;
	    Node curr = head;
	    Node next = null;

	    while (curr != null) {

	        next = curr.next;   // store next node
	        curr.next = prev;   // reverse pointer
	        prev = curr;        // move prev forward
	        curr = next;        // move curr forward
	    }

	    Node temp = prev;

	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }

	  //  System.out.println("null");
	}
	
}
