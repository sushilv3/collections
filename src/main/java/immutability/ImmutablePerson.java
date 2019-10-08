package immutability;

public class ImmutablePerson {

	private final String name;
	private final String address;

	public ImmutablePerson(final String name, final String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "ImmutablePerson [name=" + name + ", address=" + address + "]";
	}

}
