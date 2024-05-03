package edu.atria.queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();  //add and offer method used to add element in a queue used to create class linkedlist
		que.add(4);
		que.offer(3);
		que.add(2);
		que.offer(1);
		
		System.out.println("queue content is:"+que);
		System.out.println("queue content is:"+que.remove());
		System.out.println("queue updated content is:"+que);
		System.out.println("queue updated content is:"+que.peek());
		que.clear();
		System.out.println("queue updated content is:"+que.poll());  
		
		System.out.println("queue updated content is:"+que);
		
		
	}

}
