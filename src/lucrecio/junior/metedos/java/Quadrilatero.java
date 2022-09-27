package lucrecio.junior.metedos.java;

public class Quadrilatero {


    public static void area(double lado) {
        System.out.println("A Área do Quadrado é " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A Área do Retangulo é " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura ) {
        System.out.println("A Área do trapezio é " + ((baseMaior + baseMenor) * altura) / 2) ;

    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A Área do Losango é " + (diagonal1 * diagonal2)/2);
    }

}
