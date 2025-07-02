package day8.interfaces.instanceofinterfaces;

public class Jio implements Phone {
    

	@Override
	public void sms() {
		System.out.println("Messaging using jio ");
		
	}

	@Override
	public void call() {
		System.out.println("Calling using jio ");
		
	}
	

}