package InheritancePack;

public class Mobile {
	
	Mobile(){
		System.out.println("GrandParentDefaultConstructor");//this constructor will be called first when u execute any one of this child class
	}

	public void sendMessage() {
		System.out.println("SendMessage");
	}

	protected void makeCall() {
		System.out.println("makecall");
	}

	public void saveContact() {
		System.out.println("contact save");
	}
}
