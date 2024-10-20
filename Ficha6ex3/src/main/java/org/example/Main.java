package org.example;

public class Main {

    public int area(int base, int altura) {
        return base * altura;
    }

    // Método para calcular o perímetro de um retângulo
    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    public int isTriangle(int a, int b, int c) {
        // Verifica se a soma de dois lados é maior que o terceiro
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return 1;  // Pode formar um triângulo
        } else {
            return 0;  // Não pode formar um triângulo
        }
    }

}