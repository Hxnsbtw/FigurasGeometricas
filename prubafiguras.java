import java.util.Scanner;

//Clase de prueba de figuras geometricas

public class prubafiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de cada figura geométrica
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(3, 4);

        // Mostrar resultados
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del triángulo rectángulo: " + trianguloRectangulo.calcularArea());
        System.out.println("Perímetro del triángulo rectángulo: " + trianguloRectangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo rectángulo: " + trianguloRectangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo rectángulo: " + trianguloRectangulo.determinarTipoTriangulo());

        scanner.close();

    }
}
