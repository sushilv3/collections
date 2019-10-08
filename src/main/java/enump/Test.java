package enump;

public class Test {

	public static void main(String[] args) {
		Color1 c = new Color1();
		
		String black = Color1.BLACK;
		Bike b= new Bike("Honda", Color.BLUE,Enginepower.A.getValue());
		System.out.println("Bike Details : "+b);
	}

}
