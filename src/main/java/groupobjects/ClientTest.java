package groupobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientTest {

	public static void main(String[] args) {

		List<Person> p = new ArrayList<>();
		p.add(new Person("Rakesh", "Delhi", 23));
		p.add(new Person("Rakesh", "XYZ", 33));
		p.add(new Person("Mahesh", "ABC", 35));
		p.add(new Person("Suresh", "LKO", 22));
		p.add(new Person("Suresh", "JKL", 26));
		p.add(new Person("Raju", "CFT", 25));
		p.add(new Person("Manoj", "QWE", 36));
		p.add(new Person("Raju", "ZXC", 31));
		
		Map<String,List<Person>> personByName = new HashMap<>();
		for(Person pr : p) {
			if(!personByName.containsKey(pr.getName())) {
				personByName.put(pr.getName(), new ArrayList());
			}
			personByName.get(pr.getName()).add(pr);
		}
		System.out.println("Person Group By Name" + personByName);
		
		Map<String,List<Person>> personByName1 = new HashMap<>();
		
		personByName1 = p.stream().collect(Collectors.groupingBy(Person::getName));

	
		

	}

}
