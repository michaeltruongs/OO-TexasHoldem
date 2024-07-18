

import java.util.ArrayList;

public interface Observer {
	public void update();
	public void add(Observer o, TexasHoldem p);
}

class ObserverNew {
    // This is an observer class that uses the observer design pattern to monitor a poker game and notify the player when the stage changes

    // ArrayList of observers
    private ArrayList<StageChangeListener> observers = new ArrayList<StageChangeListener>();

    // Method to add observers to the ArrayList
    public void addObserver(StageChangeListener pObserver) {
        observers.add(pObserver);
    }

    // Method to remove observers from the ArrayList
    public void removeObserver(StageChangeListener pObserver) {
        observers.remove(pObserver);
    }

    // Method to notify all observers when the stage changes
    public void notifyObservers(String pStage) {
        // Loop through the observers and notify each one
        for(StageChangeListener observer : observers) {
            observer.stageChanged(pStage);
        }
    }

}


