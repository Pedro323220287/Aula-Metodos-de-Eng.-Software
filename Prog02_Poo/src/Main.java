/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 323220287
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora(); // Cria o objeto

        System.out.print("Digite o primeiro numero: ");
        double x = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double y = input.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        int op = input.nextInt();
        double resultado = 0;

        switch (op) {
            case 1:
                resultado = calc.somar(x, y);
                break;
            case 2:
                resultado = calc.subtrair(x, y);
                break;
            case 3:
                resultado = calc.multiplicar(x, y);
                break;
            case 4:
                try {
                    resultado = calc.dividir(x, y);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
