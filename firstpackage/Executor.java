package firstpackage;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setPersonName("Gayatri");
		
		p1.display();
		
		System.out.println(p1.getPersonName());
		
		Person p2=new Person();
		p2.display();
		
		Person p3=new Person();
		p3.display();

	}

}