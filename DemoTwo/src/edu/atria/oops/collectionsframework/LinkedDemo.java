package edu.atria.oops.collectionsframework;
class Node
{
	int data; //data
	Node next; // address or pointer to reference next node
	Node(int data)
	{
		this.data=data;
	}
}

class LinkedList {
 
	Node head,tail;
	public void insert(int data) { //constructor
		Node n = new Node(data);
		n.next = null;
		
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;  //linking from one node to another node
			tail = n;
		}
	
		}
	
	public void display() // used to create a method to show or display method name
	{
		Node temp = head; // head is first element in Linked list variable name
		while(temp!=null)
		{
			System.out.println(temp.data); //print the data
			temp = temp.next;
			
		}
		
	}
	
	
	
}
public class LinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.display(); //method name

	}

}
