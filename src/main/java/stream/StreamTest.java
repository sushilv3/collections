package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("abc", "", "zyx", "sdsa", "sdsa", "asd", "");
		long count = strList.stream().filter(s -> s.isEmpty()).count();
		
		System.out.println("==========*****==========");
		System.out.println("LIST OF STRING : " + strList);
		System.out.println("==========*****==========");
		
		System.out.println("List has empty string : " + count);
		System.out.println("==========*****==========");

		strList.stream().filter(s -> s.length() > 3).count();
		System.out.printf("List has strings of length more than 3 : ", strList);
		System.out.println("==========*****==========");

		long stringStartWithA = strList.stream().filter(s -> s.startsWith("a")).count();
		System.out.printf("strings Start With A : "+ stringStartWithA);
		System.out.println("==========*****==========");

		List<String> filtered = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("List without Empty Strings : " + filtered);
		System.out.println("==========*****==========");

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		System.out.println("==========*****==========");
		System.out.println("LIST OF STRING : "+G7);
		System.out.println("==========*****==========");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("Convert String to Uppercase and join them using coma " + G7Countries);
		System.out.println("==========*****==========");

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		System.out.println("==========*****==========");
		System.out.println("LIST OF INTEGER : "+numbers);
		System.out.println("==========*****==========");
		
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.printf("Square Without duplicates : " + distinct);
		System.out.println("==========*****==========");

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		System.out.println("==========*****==========");

	}

}
