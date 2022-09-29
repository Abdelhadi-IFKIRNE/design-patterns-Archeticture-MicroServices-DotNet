public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationClient applicationClient=new ApplicationClient();
        applicationClient.setTrier(new TriFusion());
        applicationClient.getTrier().Trier();
        applicationClient.setTrier(new TriRapide());
        applicationClient.getTrier().Trier();
        applicationClient.setTrier(new TriBulle());
        applicationClient.getTrier().Trier();

    }
}