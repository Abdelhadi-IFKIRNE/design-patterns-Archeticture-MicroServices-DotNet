package org.example.DP_Observable;



public class ObserverImpl implements Observer {
    private int state=0;
    @Override
    public void Update(Observable observable) {
        System.out.println("changement des attributs de la classe  :"+state);
        state=((ObservableImpl)observable).getState();
        System.out.println(" vers :---->"+state);
    }

    public void getStatus(){
        System.out.println("the new state is :"+state);
    }
}
