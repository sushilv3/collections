package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionAndUnion {

	public <T> List<T> union(List<T> list1, List<T> list2) {
		Set<T> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		return new ArrayList<T>(set);
	}

	public <T> List<T> intersection(List<T> list1, List<T> list2) {
		List<T> intersectionList = new ArrayList<>();
		intersectionList = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
		return intersectionList;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "E", "G", "H", "K"));

		System.out.println("=====Before union list1 and list 2 =====");

		System.out.println("List A => " + list1 + "List A => " + list2);

		System.out.println("=====After union list1 and list 2 =====");

		System.out.println(new IntersectionAndUnion().union(list1, list2));

		System.out.println("=====After union list1 and list 2 =====");

		System.out.println(new IntersectionAndUnion().intersection(list1, list2));

	}
}
