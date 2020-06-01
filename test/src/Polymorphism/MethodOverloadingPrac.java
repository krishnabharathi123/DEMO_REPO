package Polymorphism;

public class MethodOverloadingPrac {

	public void add(int a, int b) {
		int sumOfDigits = a + b;
		System.out.println(sumOfDigits);
	}

	public void add(int c, int d, int e) {
		int sumOfthreeDigits = c + d + e;
		System.out.println(sumOfthreeDigits);
	}

	void multiply(int mul1, int mul2) {
		int mulOfTwoNum = mul1 * mul2;
		System.out.println(mulOfTwoNum);
	}

	void multiply(int mul3, double mul4) {
		double mulOfNum = mul3 * mul4;
		System.out.println(mulOfNum);
	}

	protected void subtract(int sub1, int sub2) {
		int subValues = sub1 - sub2;
		System.out.println(subValues);
	}

	protected void subtract(double sub3, double sub4) {
		double subdblValues=sub3-sub4;
		System.out.println(subdblValues);
		}

		public void divide(int f, int g) {
			int dividevalue = f/g;
			System.out.println(dividevalue);
		}
		public void divide(int h, double j) {
			double dividevalues = h/j;
			System.out.println(dividevalues);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingPrac obj = new MethodOverloadingPrac();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.multiply(10, 20);
		obj.multiply(90, 5.6);
		obj.subtract(100, 50);
		obj.subtract(5.5, 1.5);
		obj.divide(50, 10);
		obj.divide(100, 5.5);
	}

}
