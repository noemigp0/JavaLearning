package basics.generics;

public class Student <V>{
    V age;
    Student(V age){
        this.age = age;
    }
    public void display(){
        System.out.println("Value of age: " + this.age);
    }
}
