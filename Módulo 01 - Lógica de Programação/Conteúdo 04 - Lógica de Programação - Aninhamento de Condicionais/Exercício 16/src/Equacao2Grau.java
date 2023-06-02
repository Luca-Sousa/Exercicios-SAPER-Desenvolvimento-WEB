/* Faça um programa que recebe os coeficientes de uma equação do segundo grau e mostra as
suas raízes. O programa deve avisar caso não tenha raízes reais. */

import java.util.Scanner;

public class Equacao2Grau {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("-- CÁCULO DA EQUAÇÃO DO 2 GRAU --\n");
        System.out.print("Informe o Coeficiente Quadrático: ");
        double coeficieneteA = input.nextDouble();

        System.out.print("Informe o Coeficiente Linear: ");
        double coeficieneteB = input.nextDouble();

        System.out.print("Informe a Constante: ");
        double constanteC = input.nextDouble();

        input.close();

        double delta =  Math.pow(coeficieneteB, 2) - 4 * coeficieneteA * constanteC;

        if (delta > 0) {
            double raiz1 = (-coeficieneteB + (Math.sqrt(delta))) / (2 * coeficieneteA);
            double raiz2 = (-coeficieneteB - (Math.sqrt(delta))) / (2 * coeficieneteA);
            System.out.printf("A raiz 1 é igual a %.2f%nA raiz 2 é igual a %.2f%n", raiz1, raiz2);
    
        } 
        else {
            if (delta == 0){
                double raiz1 = (-coeficieneteB + (Math.sqrt(delta))) / (2 * coeficieneteA);
                double raiz2 = (-coeficieneteB - (Math.sqrt(delta))) / (2 * coeficieneteA);
                System.out.print("Como o delta é igual a 0, a solução possui apenas um valor real ou dois resultados iguais\n");
                System.out.printf("A 1 raiz é igual a %.2f%n A 2 raiz é igual a %.2f%n", raiz1, raiz2);
            }  
            else {
                System.out.print("A fórmula não possui raízes reais!\n");
            }
        }
    }
}