package test;

public class MethodHiding {

	public static void main(String[] args) {
		B a = new B();
		a.m1();
	}
}

class A {
	public Object m1() {
		System.out.println("Static A");
		return null;
	}
}

class B extends A {
	public String m1() {
		System.out.println("static B");
		return null;
	}
}

