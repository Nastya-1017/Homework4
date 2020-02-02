package fmi.informatics.events;

public class User implements Observer {
	
	private String name;
	private Observable observable;
	
	public User(String name, Observable observable) {
		this.name = name;
		this.observable = observable;
	}
	
	public void unsubscribe() {
		observable.removeObserver(this);
	}
	
	public void buyTV() {
		System.out.println("The user " + name + " bought a " +
				observable.getClass().getSimpleName());
	}

	@Override
	public void update() {
		returnGreetings();
	}

	private void returnGreetings() {
		System.out.printf("Hello %s my dude",name);
	}
}