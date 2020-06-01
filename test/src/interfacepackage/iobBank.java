package interfacepackage;

public class iobBank implements Rbi {

	public static void main(String[] args) {
		iobBank iob=new iobBank();
		iob.minimumBalance();
		iob.maxLoanValue();
		System.out.println(iob.minLoanValue(10000));

	}

	@Override
	public void minimumBalance() {
		System.out.println("customer should have 50 rs as their minimum balance");
		
	}

	@Override
	public void maxLoanValue() {
		
		System.out.println("customer could have 10000000 as max loan value");
	}

	@Override
	public int minLoanValue(int a) {
		
		return a;
	}
	void own() {
		System.out.println("ownmethod");
	}



	}
