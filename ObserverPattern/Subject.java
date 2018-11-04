package DesignPatterns.ObserverPattern;

public interface Subject {
	 void attach(Observer o);
	 void dettach(Observer o);
	 void notifyObserver();
	 void setNews(String news);
}
