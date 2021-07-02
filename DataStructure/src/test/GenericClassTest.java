package test;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericTest<AAA> test = new GenericTest<AAA>();
		test.testMethod(new BB());
	}
}

class GenericTest<T> {
	
	public void testMethod (T args) {
		System.out.println("GenericTest : " + args.getClass().getName());
	}
}

class AAA {
	
}

class BB extends AAA {
	
}

class C extends BB{
	
}