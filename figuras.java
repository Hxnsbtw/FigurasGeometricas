import java.util.Scanner;

// Clase que modela un círculo
class Circulo {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro del círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase que modela un rectángulo
class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

// Clase que modela un cuadrado
class Cuadrado {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área del cuadrado
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // Método para calcular el perímetro del cuadrado
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase que modela un triángulo rectángulo
class TrianguloRectangulo {
    private double base;
    private double altura;

    // Constructor
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular la hipotenusa del triángulo rectángulo
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    // Método para determinar el tipo de triángulo rectángulo
    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    // Método para calcular el área del triángulo rectángulo
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    // Método para calcular el perímetro del triángulo rectángulo
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
}