public class Aposta {
    private double valorAposta;
    private double porcentagemGanho;
    private String jogo;

    public Aposta(double valorAposta, double porcentagemGanho, String jogo) {
        this.valorAposta = valorAposta;
        this.porcentagemGanho = porcentagemGanho;
        this.jogo = jogo;
    }

    public double getValorAposta() {
        return valorAposta;
    }
}
