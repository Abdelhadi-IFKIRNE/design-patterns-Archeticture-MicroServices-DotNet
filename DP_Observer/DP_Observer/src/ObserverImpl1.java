public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl)observable).getState();
        System.out.println("j'applique l'implémentation 1 : "+state+1);
    }
}
