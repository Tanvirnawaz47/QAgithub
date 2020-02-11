package arrayListLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("zini");
		words.add("akther");
		words.add("nawaz");
		words.add("tanvir");
		words.add("sun");
		words.add("sun");
		System.out.println(words.size());
		for (String a : words) {
			System.out.println(a);
		}

		System.out.println("=====================================");

		Set<String> word = new LinkedHashSet<String>();

		word.add("zini");
		word.add("akther");
		word.add("nawaz");
		word.add("tanvir");
		word.add("sun");
		word.add("sun");
		System.out.println(word.size());
		for (String a : word) {
			System.out.println(a);
		}
		System.out.println("===================================");

		Set<String> names = new TreeSet<String>();

		names.add("zini");
		names.add("akther");
		names.add("nawaz");
		names.add("tanvir");
		names.add("sun");
		names.add("sun");
		System.out.println(word.size());
		for (String a : names) {
			System.out.println(a);
		}
		System.out.println("===================================");
		Object[] objArray = words.toArray();
		System.out.println(objArray[0]);
		System.out.println(objArray.length);
	}

}
