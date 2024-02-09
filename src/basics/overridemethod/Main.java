package basics.overridemethod;

public class Main {

    public static void main(String args[]){

        Animal perro = new Dog();
        Animal gato = new Cat();

        perro.speak();
        gato.speak();
    }
}
