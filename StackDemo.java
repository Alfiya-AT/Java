import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}
}