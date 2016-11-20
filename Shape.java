/**
 * Created by marina on 16.11.16.
 */
public class Shape {
    private String name;



    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void make(){
        System.out.println("I make shape "+name);
    }
}
