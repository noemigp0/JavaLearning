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


}
