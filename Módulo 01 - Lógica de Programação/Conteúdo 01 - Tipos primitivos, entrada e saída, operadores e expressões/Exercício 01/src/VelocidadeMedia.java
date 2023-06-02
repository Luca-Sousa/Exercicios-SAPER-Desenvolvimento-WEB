/*João consegue terminar uma corrida com percurso de 1260 metros em 4 minutos.
Faça um programa para mostrar a velocidade média de João em metros por segundo.

COMPLEMENTO: mostrar a velocidade média em quilômetros por hora também.*/

public class VelocidadeMedia {
    public static void main(String[] args) {
        System.out.printf("A velocidade Média de Joao é: %.2f metros/segundo\n", 1260.0/(4*60));
        System.out.printf("A velocidade Média de Joao é: %.2f KM/hora\n", (1260.0/1000)/(4.0/60));
    }
}