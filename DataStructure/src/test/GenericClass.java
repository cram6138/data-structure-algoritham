package test;

public class GenericClass {

	public static void main(String[] args) {
		GenericsTest<AA> test = new GenericsTest<>();
		test.testM(new CC());
	}
}

class GenericsTest<T> {
	public void testM(T obj) {
		System.out.println(obj.getClass().getName());
	}
}

class AA {
	
}

class BBA extends AA {
	
}

class CC extends BBA {
	
}