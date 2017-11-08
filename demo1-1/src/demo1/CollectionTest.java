package demo1;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		strs.add(null);
		System.out.println(strs.size());
		if (strs.isEmpty()) {
			System.out.println(111);
		}
		for (String string : strs) {
			if (string.equals(123)) {
				System.out.println(222);
			}
			System.out.println(string);
		}
	}
}
