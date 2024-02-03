package basics.generics;

public class Car <T>{

    private T name;
    private T motor;

    public Car(T name, T motor){
        this.name = name;
        this.motor = motor;
    }

    public T getName(){
        return this.name;
    }

    public void setName(T name){
        this.name = name;
    }

    public T getMotor(){
        return this.motor;
    }

    public void setMotor(T motor){
        this.motor = this.motor;
    }


}
