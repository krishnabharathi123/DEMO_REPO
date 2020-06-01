package InheritancePack;

public class SmartPhone extends AndroidPhone {

	private void connectWhatsapp() {
		System.out.println("Whatsapp connected");
		super.takeVidoe();//super class method
		this.takeVidoe();//Overridden class method
	}
	
	@Override
	void takeVidoe()
	{
		System.out.println("take function video");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sm = new SmartPhone();
		sm.sendMessage();
		sm.saveContact();
		sm.takeVidoe();
		sm.makeCall();
		sm.connectWhatsapp();
	}

}
