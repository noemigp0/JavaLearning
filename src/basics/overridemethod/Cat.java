package basics.overridemethod;

public class Cat extends Animal {

    @Override
    public void speak() {
        //super.speak();
        System.out.println("Meow");
    }
}
