import java.util.ArrayList;

public class Usuario {
    private String username;
    private String nome;
    private String email;
    private double saldo;

    private ArrayList<Aposta> apostasUsuario = new ArrayList<Aposta> (); //composição

    public Usuario(String nome, String username, String email, double saldoInicial) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.saldo = saldoInicial;
    }

    public void fazAposta(Aposta minhaAposta) {
        apostasUsuario.add(minhaAposta);
        saldo = saldo - minhaAposta.getValorAposta();
    }

    public double getSaldo() {
        return saldo;
    }
}
