package org.example;

public interface observable {
    void addObserver(Figure figure);
    void removeObserver(Figure figure);
    void notifyObservers();
}
