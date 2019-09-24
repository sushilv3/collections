package partitioningby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
	private String name;
	private String city;
	private int age;

	Person(final String name, final String city, final int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Person() {

	}

	public Map<Boolean, List<Person>> partitionByAge(List<Person> people, int criteria) {
		Map<Boolean, List<Person>> map = people.stream().collect(Collectors.partitioningBy(p -> p.age <= criteria));
		return map;
	}

	public Map<Boolean, List<String>> partitionByAgeDisplayName(List<Person> people, int criteria) {
		Map<Boolean, List<String>> map = people.stream().collect(Collectors.partitioningBy(p -> p.age <= criteria,
				Collectors.mapping(p -> p.name, Collectors.toList())));
		return map;
	}
	
	

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

}
