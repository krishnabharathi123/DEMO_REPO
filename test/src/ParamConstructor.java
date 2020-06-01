
public class ParamConstructor extends ConstructorPrac{
int lemon=10;
	ParamConstructor(int a, String name){
		//this();
		System.out.println(a+name);
		int lemon=5;
		System.out.println(lemon);
		System.out.println(this.lemon);
		
	}
	ParamConstructor(){
		this(10,"ford");
		System.out.println("default");
		this.empDetails();
	}
	void empDetails() {
		System.out.println("methodexecution");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConstructor pr = new ParamConstructor(1,"bahratahi");
		ParamConstructor pb = new ParamConstructor();
		
	}

}
