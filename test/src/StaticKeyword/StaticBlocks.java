package StaticKeyword;

public class StaticBlocks {
	static String message="hello world";//static variable
	static{
		System.out.println("executing static block");//static block will be executed first even before main method
	}
	public static void staticMethod() {//static method
		System.out.println("executing staic method");
	}
	public static int sum(int a, int b) { //staic method with int return type
		int c= a+b;
		return c;
		
	}
public static void main(String[] args) {
	System.out.println("executing main method");
	staticMethod();
	System.out.println("static variable:"+" "+ message);//hello world is stored in space created for message variable.
	message="welcome";//welcome is replaced in space created for message variable.
	System.out.println("static variable:"+" "+ message);
	System.out.println(sum(50,100));
	}
}
