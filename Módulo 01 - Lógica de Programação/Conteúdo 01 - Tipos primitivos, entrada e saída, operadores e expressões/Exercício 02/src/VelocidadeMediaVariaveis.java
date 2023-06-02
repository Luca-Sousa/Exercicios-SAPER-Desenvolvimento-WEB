/*João consegue terminar uma corrida com percurso de 1260 metros em 4 minutos.
Faça um programa para mostrar a velocidade média de João em metros por segundo. 
Use variáveis para aumentar a legibilidade do seu programa.*/

public class VelocidadeMediaVariaveis {
    public static void main(String[] args) {
        
        double distancia = 1260.0;
        double tempoMinutos = 4;
        double tempoSegundos = tempoMinutos * 60;
        double velocidadeMedia = distancia / tempoSegundos;

        System.out.printf("A velocidade Média de Joao é: %.2f metros/segundo\n", velocidadeMedia);
    
    }
}
