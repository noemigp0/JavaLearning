package basics.overridemethod;

public class Dog extends Animal {

    @Override
    public void speak(){
        //super.speak();
        System.out.println("Woof");
    }

}
