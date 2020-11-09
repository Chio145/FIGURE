package RocioAguirre;

public class Trapecio implements Shape{
private double baseMenor;
private double baseMayor;
private double altura;
private double diagonal;

    public Trapecio(double baseMenor, double baseMayor, double altura, double diagonal) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.diagonal = diagonal;
    }

    @Override
    public double getArea() {
        return ((baseMayor+baseMenor)*altura)/2;
    }

    @Override
    public double getPerimeter() {
        return baseMayor+baseMenor+(2*diagonal);
    }
}
