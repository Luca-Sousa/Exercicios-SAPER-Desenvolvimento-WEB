/* Faça um programa que recebe três valores e verifica e mostra se eles podem ou não formar
um triângulo. Se for possível formar um triângulo, verificar e mostrar também se o
triângulo formado é equilátero, isósceles ou escaleno. */

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("-- FORMAÇÃO DE UM TRIÂNGULO --\n");
        System.out.print("Informe o Lado A: ");
        int ladoA = input.nextInt();

        System.out.print("Informe o Lado B: ");
        int ladoB = input.nextInt();

        System.out.print("Informe o Lado C: ");
        int ladoC = input.nextInt();

        input.close();

        if ((ladoA + ladoB) >= ladoC ||(ladoA + ladoC) >= ladoB || (ladoB + ladoC) >= ladoA ) {
            System.out.print("Os lados formam um triângulo: ");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Equilátero!");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Escaleno!");
            } else {
                System.out.println("Isósceles!");
            }
        } else {
            System.out.print("Os lados não formam um triângulo!");
        }
    }
}