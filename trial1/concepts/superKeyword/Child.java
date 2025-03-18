package trial1.questions.concepts.superKeyword;

public class Child extends Parent {

    public Child() {
        // the super keyword is called by default over here and parent should have a default constructor.
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Child is eating");
    }

}
