public class Main {
    public static void main(String[] args) throws Exception {
        
        Usuario user1 = new Usuario("Lucas", "luke", "lucas2015366@gmail.com", 12);
        Usuario user2 = new Usuario("João", "J", "joao@gmail.com", 10);

        Aposta aposta1 = new Aposta(5, 0.3, "Flamengo X Fluminense");

        Aposta aposta2 = new Aposta(3, 0.2, "Forataleza X Ceará");

        System.out.printf("Saldo do user1: %.2f%n", user1.getSaldo());

        user1.fazAposta(aposta1);
        user2.fazAposta(aposta2);

        System.out.printf("Saldo do user1: %.2f%n", user1.getSaldo());
    }
}
