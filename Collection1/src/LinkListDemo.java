import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		//LinkedList<Integer> linkList = new LinkedList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		
		/*
		 * To add or remove item at the end of a list use Arraylist
		 * To add or remove item from anywhere middle use LinkedList
		 */
		
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkList);

	}
	private static void doTimings(String type, List<Integer> list ) {
		
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// add item @ end of list
		
		/*for (int i = 0; i < 1E5; i++) {
			list.add(i);
		} */
		
		// Add item elsewhere
		for (int i = 0; i < 1E5; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		
	}

}
