public class Aluno {
    private String nome;
    private double media;

    //Construtor da Classe Aluno
    public Aluno (String nomeInicial, double mediaInicial) {
        nome = nomeInicial;
        
        if (0 <=mediaInicial && mediaInicial <= 100) {
            media = mediaInicial;
        }
    }

    public void setNome (String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setMedia (double novaMedia) {
        if (0 <= novaMedia && novaMedia <= 100) {
            media = novaMedia;
        }
    }

    public double getMedia() {
        return media;
    }

    public char conceito() {
        if (media >= 90) {
            return 'A';
        }
        else if (media >= 80 && media < 90) {
            return 'B';
        }
        else if (media >= 70 && media < 80) {
            return 'C';
        }
        else if (media >= 60 && media < 70) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}