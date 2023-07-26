public class App {
	public static void main(String[] args) {
		Super s = new Subclass();
		s.foo();
        s= new Super();
        s.foo();
	}
}

class Super {
	void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	void foo() {
		System.out.println("Subclass");
	}
}