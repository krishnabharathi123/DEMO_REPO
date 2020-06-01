package StaticKeyword;

public class FinalKeyword {
	final static String companyName;// this plain final static value could be initialized only inside static block
	static {
		companyName="Volante";
	}
	final String EmpName;// this plain final value could be initialized only inside constructor
	/*FinalKeyword(){
		EmpName="Krishna";
	}*/
	FinalKeyword(int a){
		EmpName="Krishna";
		System.out.println(EmpName);
	}

	public static void main(String[] args) {
		FinalKeyword key = new FinalKeyword(2);
		System.out.println(companyName);
		
		
	}

}
