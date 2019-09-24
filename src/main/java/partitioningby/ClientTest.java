package partitioningby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ClientTest {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people = Arrays.asList(new Person("rakesh", "kanpur", 30),
								new Person("mahesh", "lucknow", 22),
								new Person("suresh", "allahabad", 24),
								new Person("alok", "uunao", 36),
								new Person("amit", "kanoj", 25),
								new Person("shyam", "bareli", 31),
								new Person("shivam", "kanpur", 29),
								new Person("anuj", "sitapur", 35));
		Person p = new Person();
		Map<Boolean,List<Person>> map = p.partitionByAge(people, 30);
		System.out.println("Partitioning by age : " + map);
		
		System.out.println("=====*****=====");
		
		Map<Boolean, List<String>> map1 = p.partitionByAgeDisplayName(people, 30);
		
		System.out.println(map1);
		

	}

}
