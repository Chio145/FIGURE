package RocioAguirre;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int Menu=0;
        double f1 = 0, f2 = 0, f3 = 0, f4= 0;
        int f5;
        double t=0;
        System.out.println("\t Bienvenid@ Usuario!" +
                "\n Selecciona una Figura"+"\n 1- Cuadrado"+
                "\n 2- Triángulo"+ "\n 3- Círculo"+
                "\n 4- Trapecio");
        System.out.println("Digite la opción de su preferencia: ");
        Menu= o1.nextInt();

        switch (Menu){
            case 1:
                System.out.println("Selecciono el cuadrado");
                System.out.println("Opciones:"+"\n1= Área"+"\n2= Perímetro");
                System.out.println("Digite la opción de su preferencia:");
                f5= o1.nextInt();
                System.out.println("Digite el lado:");
                f1= o1.nextDouble();
                if(f5==1){
                    Cuadrado c1= new Cuadrado(f1);
                    System.out.println("El área es: "+ c1.getArea());
                }
                else{
                    Cuadrado c1= new Cuadrado(f1);
                    System.out.println("El perímetro es: "+ c1.getPerimeter());
                }
                break;
            case 2:
                System.out.println("Selecciono el triángulo");
                System.out.println("Opciones:"+"\n1= Área"+"\n2= Perímetro");
                System.out.println("Digite la opción de su preferencia:");
                f5= o1.nextInt();
                System.out.println("Digite la base: ");
                f1= o1.nextDouble();

                if(f5==1){
                    System.out.println("Digite la altura: ");
                    f2= o1.nextDouble();
                    Triangulo t1= new Triangulo(f1 ,f2);
                    System.out.println("El área es: "+ t1.getArea());
                }
                else{
                    Triangulo t1= new Triangulo(f1, t);
                    System.out.println("El perímetro es: "+ t1.getPerimeter());
                }
                break;
            case 3:
                System.out.println("Selecciono el círculo");
                System.out.println("Opciones:"+"\n1= Área"+"\n2= Perímetro");
                System.out.println("Digite la opción de su preferencia:");
                f5= o1.nextInt();
                System.out.println("Digite el radio:");
                f1= o1.nextDouble();
                if(f5==1){
                    Circulo r1= new Circulo(f1);
                    System.out.println("El área es: "+ r1.getArea());
                }
                else{
                    Circulo r1= new Circulo(f1);
                    System.out.println("El perímetro es: "+ r1.getPerimeter());
                }
                break;
            case 4:
                System.out.println("Selecciono el trapecio");
                System.out.println("Opciones:"+"\n1= Área"+"\n2= Perímetro");
                System.out.println("Digite la opción de su preferencia:");
                f5= o1.nextInt();
                System.out.println("Digite la base menor: ");
                f1= o1.nextDouble();
                System.out.println("Digite la base mayor: ");
                f2= o1.nextDouble();
                if(f5==1){
                    System.out.println("Digite la altura: ");
                    f3= o1.nextDouble();

                    Trapecio t1= new Trapecio(f1 ,f2, f3, f4);
                    System.out.println("El área es: "+ t1.getArea());
                }
                else{
                    System.out.println("Digite el largo de las diagonales: ");
                    f4= o1.nextDouble();
                    Trapecio t1= new Trapecio(f1, f2, f3, f4);
                    System.out.println("El perímetro es: "+ t1.getPerimeter());
                }
                break;
            default:
                System.out.println("Opción no existente");
                break;
        }


    }
}
