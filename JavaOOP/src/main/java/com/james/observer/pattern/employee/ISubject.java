package com.james.observer.pattern.employee;

public interface ISubject {

	 void registerObservers(IObserver obs);
	 void removeObservers(IObserver obs);
	 void notifyObservers();
}
