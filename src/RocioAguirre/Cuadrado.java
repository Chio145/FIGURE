package RocioAguirre;

public class Cuadrado implements Shape{
private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimeter() {
        return lado*4;
    }
}
