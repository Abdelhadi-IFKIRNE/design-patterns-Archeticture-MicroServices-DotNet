public class Main {
    public static void main(String[] args) {

        ObservableImpl observable=new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(85);

        observable.unsubscribe(observer2);
        observable.setState(85);


    }
}