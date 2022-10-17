
public class Main {
    public static void main(String[] args) {
        composite racine=new composite("Composite_1");
        composite composite2=new composite("composite2");
        racine.addComponent(composite2);
        racine.addComponent(new Element("Element_1"));
        racine.addComponent(new Element("Element_2"));
        racine.addComponent(new Element("Element_3"));
        racine.addComponent(new Element("Element_4"));
        composite2.addComponent(new Element("Element_5"));
        composite2.addComponent(new Element("Element_6"));
        racine.operation();
    }
}