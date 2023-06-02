public class ContaPoupanca {

    private final String nome;
    private static double taxaRendimentoAnual;
    private double quantidadeAtualDepositada;

    public ContaPoupanca (String nome, double quantidadeAtualDepositada) {
        this.nome = nome;
        this.quantidadeAtualDepositada = quantidadeAtualDepositada;
    }

    public void rendimentoMensal() {
        quantidadeAtualDepositada += quantidadeAtualDepositada * taxaRendimentoAnual / 12.0;
    }

    public static void mudaTaxaRendimentoAnual (double novaTaxaRendimentoAnual) {
        taxaRendimentoAnual = novaTaxaRendimentoAnual;
    }

    public double getQuantidadeAtualDepositada () {
        return quantidadeAtualDepositada;
    }

    public String getNome() {
        return nome;
    }
}
