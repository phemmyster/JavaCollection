 import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		// adding number
		numbers.add(10);
		numbers.add(198);
		numbers.add(34);
		numbers.add(45);
		numbers.add(957);
		numbers.add(3487);
		numbers.add(185);
		
		
		//retrieving number
		
		/*System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		System.out.println(numbers.get(4));
		System.out.println(numbers.get(5));
		System.out.println(numbers.get(6));*/
		
		//separation
		System.out.println("------------------");
		
		// indexed for loop
		System.out.println("\nIteration #1: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
		
		// 
		numbers.remove(numbers.size() -1 );
		
		numbers.remove(0);
		
		//separation
		System.out.println("------------------");
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers){
			//System.out.println(numbers);
			System.out.println(value);
		}
		
		
		

	}

}
