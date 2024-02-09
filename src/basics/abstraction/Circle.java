package basics.abstraction;

public class Circle extends Figure {

    final double pi = 3.1416;

    public Circle(){}

    public Circle(double radio, double x, double y){
        super(x,y);
        this.radio = radio;
    }

    private double radio;
    @Override
    public double calcularArea(){

        return pi * ( radio * radio);
    }


}
