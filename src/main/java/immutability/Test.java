package immutability;

public class Test {

	public static void main(String[] args) {
			ImmutablePerson ip = new ImmutablePerson("satish", "pune");
		
			System.out.println("Person Name : "+ip.getName());
			
			System.out.println("Person address : "+ip.getAddress());

	}

}
