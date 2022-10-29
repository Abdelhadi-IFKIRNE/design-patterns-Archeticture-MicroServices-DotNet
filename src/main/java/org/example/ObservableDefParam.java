package org.example;

public interface ObservableDefParam {
    void addObserver(Figure figure);
    void removeObserver(Figure figure);
    void notifyObservers();
}
