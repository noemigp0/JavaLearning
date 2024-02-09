package basics.overridemethod;

public class Animal {

    String name;

    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }
    protected void speak(){
        System.out.println("Hello");
    }




}
