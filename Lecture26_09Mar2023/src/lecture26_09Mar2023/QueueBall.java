package lecture26_09Mar2023;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBall {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Matthew");
		queue.add("Rory");
		queue.add("Sara");
		queue.add("Chris");
		queue.add("Alyssa");
		queue.add("Nate");
		
		String name;
		
		System.out.println(queue.size());
		name = queue.poll();
		System.out.println(name);
		System.out.println(queue.size());
			
			
			
		}
		

		
	
}

