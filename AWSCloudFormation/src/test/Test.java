package test;import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		

	}
	static class Parent {
		protected Object name;
	}
	
	static class Child extends Parent {
		private String name = "Mary";
	}
	
	static class GrandSon extends Child {
		private String name = "Ben";
	}
}
