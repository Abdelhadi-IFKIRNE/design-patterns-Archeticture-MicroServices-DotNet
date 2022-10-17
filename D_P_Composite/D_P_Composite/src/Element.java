public class Element extends Component{
    public Element(String name) {
        super(name);
    }

    @Override
    public void operation() {
        String tab="";
        for (int i = 0; i < level; i++) tab=tab+"-";
        System.out.println(tab+" "+name);
    }
}
