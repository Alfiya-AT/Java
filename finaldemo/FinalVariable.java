package finaldemo;
public class FinalVariable {
	// final instance variable must be initialized
	//final int x1;
	    final int x = 100;
	
	// Declare a static blank final variable.
		final static int Y=100;
		
		// instatnce method
		void change() {
		//	x = 30; // final variables can't be reassigned
		//	Y = 200; // final static variables can't be reassigned
		}
		// Declare a static block to initialize the final static variable.
		static {
			//Y = 20;
		//	Z = 100; // Once intialized can't be reassigned
			System.out.println("Value of Y: " + Y);
		}
}
