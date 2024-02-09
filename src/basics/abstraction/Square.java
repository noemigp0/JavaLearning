package basics.abstraction;

public class Square extends Figure{
    private double lado;

    public Square(){

    }

    public Square(double lado, double x, double y){
        super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return  lado * lado;
    }
}
