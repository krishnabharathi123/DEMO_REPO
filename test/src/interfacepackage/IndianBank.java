package interfacepackage;

public class IndianBank extends iobBank implements Rbi {

	public static void main(String[] args) {
IndianBank bk=new IndianBank();
bk.own();//method of iobBank
bk.minimumBalance();
		
	}

	@Override
	public void minimumBalance() {
		super.minimumBalance();
		
	}

	@Override
	public void maxLoanValue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int minLoanValue(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
