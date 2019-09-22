package removeduplicatesfromlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(1, 1, 2, 55, 45, 45, 6, 8, 8, 10, 9, 10);
		System.out.println("Original List : " + list);
		
		Listcreator lc = new Listcreator();
		
		List<Integer> newList = lc.removeDuplicates(list);
		System.out.println("ArrayList with duplicates removed: " + newList);
		
	}

	

}
