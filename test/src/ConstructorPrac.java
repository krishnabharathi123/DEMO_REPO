
public class ConstructorPrac {
	int a=50;
//defaut constructor
	ConstructorPrac(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	int c= this.a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorPrac con= new ConstructorPrac();
		System.out.println(con.a);
	}

}
