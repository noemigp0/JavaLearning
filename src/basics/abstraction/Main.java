package basics.abstraction;

public class Main {
    public static void main(String args[]){

        Figure.Circle circulo = new Figure.Circle(5,7,6);
        Square cuadrado = new Square(4,5,5);

        System.out.println("Area del circulo: " +circulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
