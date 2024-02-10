package basics.abstraction;

public abstract class Figure {
    protected double x;
    protected double y;

    protected Figure(){
    }
    protected Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();


    public static class Circle extends Figure {

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
}
