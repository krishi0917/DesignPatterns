package DesignPatterns.ObserverPattern;

public class Main {

	public static void main(String[] args) {
		Subject S = new ConcreteSubject();
		Observer A = new ConcreteObserverA();
		Observer B = new ConcreteObserverB();
		S.attach(A);
		S.attach(B);
		S.setNews("Petrol price Rise, Again");
		
		//Detaching the observer A from the list will result in notification
		//to be sent to B only
		System.out.println("The observer A is not in the list now");
		S.dettach(A);
		S.setNews("Even Diesel price is up");
		
	}

}
