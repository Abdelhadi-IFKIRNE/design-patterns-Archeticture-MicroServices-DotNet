import java.util.ArrayList;
import java.util.List;

public class composite extends Component{
    protected List<Component> components=new ArrayList<>();
    public composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        String tab="";
        for (int i = 0; i <level; i++) tab+="-";
        System.out.println(tab+" "+name);
        for (Component c:components
             ) {
            c.operation();
        }
    }

    public void addComponent(Component component){
        component.level=this.level+1;
        this.components.add(component);
    }

    public void removeComponent(Component component){
        this.components.remove(component);
    }
}
