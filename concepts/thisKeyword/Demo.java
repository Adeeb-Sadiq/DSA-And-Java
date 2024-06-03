package concepts.thisKeyword;

public class Demo {
    private String name;

    public Demo(){
        this("George");
        System.out.println("Object is created.");
    }
    public Demo(String name) {
        this.name = name;
    }

    // this keyword can not be used in static function as static can be called
    // without the object creation.
    public static void hello(){
        System.out.println("Hello there ");
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Demo myDemo = new Demo();
        System.out.println(myDemo.getName());

        Demo.hello();
    }
}
