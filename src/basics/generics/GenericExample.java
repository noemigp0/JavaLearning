package basics.generics;

public class GenericExample {
    public static void main(String args[]){
        Student<String> std1 = new Student<>("25.5f");
        std1.display();


        Car<String> car = new Car<>("Ford", "500");

        System.out.println("Name: " + car.getName());
        System.out.println("Motor: " + car.getMotor());

        car.setName("Ford nuevo");

        System.out.println("Name: " + car.getName());
        System.out.println("Motor: " + car.getMotor());
    }
}
