package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		Map<String, Integer> nameWithAge = new HashMap<>();
		nameWithAge.put("ramesh", 35);
		nameWithAge.put("mahesh", 55);
		nameWithAge.put("suresh", 45);
		nameWithAge.put("alok", 25);
		nameWithAge.put("ramu", 22);
		nameWithAge.put("manoj", 65);
		nameWithAge.put("anuj", 30);

		/*
		 * nameWithAge.entrySet().stream() .sorted(Map.Entry.<String, Integer>
		 * comparingByValue()) .forEach(System.out::println);
		 */
//		Map<String, Integer> sortedByAge = nameWithAge.entrySet().stream()
//				.sorted(Map.Entry.<String, Integer>comparingByValue())
//				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
//		System.out.println("sorted by age and collectors in new map : " + sortedByAge);

		Map<String, Integer> sortedByValue = nameWithAge.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Map sorted by value in increasing order: " + sortedByValue);
	
		Map<String, Integer> sortedByValueDesc = nameWithAge.entrySet()
		        .stream()
		        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
		                LinkedHashMap::new));

		    System.out.println("Map sorted by value in descending order: "
		        + sortedByValueDesc);
	}

}
