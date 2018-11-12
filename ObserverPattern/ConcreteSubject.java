package DesignPatterns.ObserverPattern;

import java.util.ArrayList;


public class ConcreteSubject implements Subject {

	private ArrayList<Observer> observers;
	
	public ConcreteSubject(){
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer obj){
		observers.add(obj);
	}
	public void dettach(Observer obj){
		observers.remove(obj);
	}
	
	public void setNews(String news){
		notifyObserver();
	}
	
	public void notifyObserver(){
			for(Observer obj : observers)
			{
				obj.update();
			}
	}
	
}
