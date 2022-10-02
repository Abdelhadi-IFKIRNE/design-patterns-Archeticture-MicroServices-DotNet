public class ObserverImpl2 implements Observer{
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl)observable).getState();
        System.out.println("j'applique l'implémentation 2 : "+state+6);
    }
}
