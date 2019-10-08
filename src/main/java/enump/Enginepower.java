package enump;

public enum Enginepower {
	A(110), B(150), C(180);
	private final int value;

	Enginepower(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
