package arrayListLearning;

import java.awt.List;
import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> names = new ArrayList<String>(); names.add("sun");
		 * names.add("zini"); names.add("anusha"); System.out.println(names.size());
		 * System.out.println(names.get(0)); names.remove(1);
		 * System.out.println(names.size()); }
		 */
		// ArrayList<String> names= new ArrayList<String>();// at Work they began with
		// list then decide the kind later

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 99; i < 1000; i++) {
			numbers.add(i);

		}

		System.out.println(numbers);
		System.out.println(numbers.get(47));

		
	}

}