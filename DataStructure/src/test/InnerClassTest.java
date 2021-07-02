package test;

public class InnerClassTest {

	public static void main(String[] args) {
		//String methodLocalClassValue = new InnerClassTest();
		System.out.println(new TestClass.InnerClass().gender);
		System.out.println(TestClass.InnerClass.secondName);

	}
	
	public Object testMethod() {
		class MethodLocalInnerClass {
			private String name = "Ram";
			public String secondName = "Chaurasiya";
			
			private String gender = "Male";
		}
		return new MethodLocalInnerClass();
	}
	
	
}

class TestClass {
	
	static class InnerClass {
		private static String name = "Ram";
		public static String secondName = "Chaurasiya";
		
		String gender = "Male";
	}

}