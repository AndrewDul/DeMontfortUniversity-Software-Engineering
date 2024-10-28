package lib;

interface Car {
	String color = "Blue";
	String brand = " ";
	void moveForward ();
	void movebackward ();
}



public class InterfaceExample implements Car {
	
		

	public static void main(String[] args) {
		
		System.out.println("The color is: "+color);
		
		InterfaceExample moveForward = new InterfaceExample();
		moveForward.moveForward();
		
		InterfaceExample moveBackward = new InterfaceExample();
		moveBackward.movebackward();

	}


	
	@Override
	public void moveForward() {
		System.out.println("I'm moving forward");
	}

	@Override
	public void movebackward() {
		System.out.println("I'm moving backward");
		
	}

}
